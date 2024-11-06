package org.example;

import okhttp3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

public class OpenAITest {
    private static final Logger logger = LogManager.getLogger(OpenAITest.class);
    private static final String API_KEY;

    static {
        Properties properties = new Properties();
        try {
            properties.load(OpenAITest.class.getClassLoader().getResourceAsStream("config.properties"));
            API_KEY = properties.getProperty("OPENAI_API_KEY");
            logger.info("API Key loaded successfully.");
        } catch (IOException e) {
            logger.error("Failed to load API key", e);
            throw new RuntimeException("Failed to load API key", e);
        }
    }

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        String prompt = "What is the capital of France?";

        String json = "{\n" +
                "  \"model\": \"gpt-3.5-turbo\",\n" +
                "  \"messages\": [{\"role\": \"user\", \"content\": \"" + prompt + "\"}],\n" +
                "  \"max_tokens\": 50\n" +
                "}";

        RequestBody body = RequestBody.create(
                json, MediaType.get("application/json")
        );

        Request request = new Request.Builder()
                .url("https://api.openai.com/v1/chat/completions")
                .header("Authorization", "Bearer " + API_KEY)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                logger.info("Response received:");
                if (response.body() != null) {
                    logger.info("Response body: {}", response.body().string());
                } else {
                    logger.warn("Response body is null.");
                }
            } else {
                logger.error("Request error: {} with code: {}", response.message(), response.code());
            }
        } catch (IOException e) {
            logger.error("Error executing request", e);
        }
    }
}
