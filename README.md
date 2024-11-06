# OpenAI Java Project

A Java application that integrates with the OpenAI API to demonstrate basic functionality for sending requests and receiving responses from OpenAI models. This project is designed as a foundation for working with artificial intelligence in Java.

## Features

- **API Integration:** Simple setup for connecting to the OpenAI API.
- **Configuration Options:** Flexible configuration for managing API keys securely.
- **Supported Models:** Option to select and interact with different OpenAI models.

## Technologies Used

- **Java** – Core programming language for this project.
- **Maven** – Used for dependency management and project build.
- **BFG Repo-Cleaner** – Used to remove sensitive information from the Git history.

## Installation and Setup

1. **Clone the Repository**

   Clone this repository to your local machine:
   ```bash
   git clone https://github.com/ZlatkoAA/OpenAI-Project.git

Set up the OpenAI API Key

Create a config.properties file in the src/main/resources directory and add your OpenAI API key:

OPENAI_API_KEY=your_openai_api_key_here

Alternatively, you can set the API key as an environment variable for increased security.

Build the Project

Navigate to the project directory and build the project using Maven:
mvn clean install
Run the Project

You can run the project from IntelliJ IDEA or directly via the command line:
java -jar target/OpenAI-1.0-SNAPSHOT.jar
Usage
This project demonstrates basic usage of the OpenAI API in Java. Once the setup is complete, you can send requests to OpenAI models and receive responses. This can serve as a foundation for more advanced AI applications.

Example Usage
In OpenAITest.java, you can find example code for making requests to the OpenAI API. Modify this code as needed to interact with different models or customize your requests.

Contributing
Contributions are welcome! To contribute:

Fork the repository.
Create a new branch (git checkout -b feature-branch).
Commit your changes (git commit -m 'Add new feature').
Push to the branch (git push origin feature-branch).
Open a Pull Request.
License
This project is open-source and available for modification and redistribution under the terms of the MIT license.

---

This `README.md` file should give clear instructions to anyone wanting to use or contribute to your project. Let me know if there are additional details you’d like to include!
