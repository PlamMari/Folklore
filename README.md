![Folklore DB banner](https://github.com/PlamMari/Folklore/blob/master/Folklore_DB%20(2).png)


# Folklore DB

## Description

This is a Java application that let's you enter Folklore stories into a database using Hibernate to create your Folklore Encyclopedia.

## Installation

Install Java: Ensure you have Java installed on your system. The project is compatible with Java version 21.
Install Gradle: You will need Gradle to build and run the project. Make sure it’s installed and configured properly.
Clone the Repository: Clone the project repository from GitHub to your local machine.
Configure Build Script: The build.gradle file is already configured with the necessary plugins and dependencies. No changes are required here.
Build the Project: Navigate to the project directory and run the following command to build the project:
```cmd
gradle build
```
Run the Application: After a successful build, you can run the application using:
```cmd
gradle bootRun
```
Access H2 Database: The project uses an H2 in-memory database for runtime data storage. It can be accessed through the H2 console.
Development Tools: For development purposes, Spring Boot DevTools is included for automatic restarts and live reloading.

## Installation with Docker

1. Prerequisites

Ensure Docker is installed on your system.
2. Building the Docker Image

Navigate to the directory containing the Dockerfile.
Run the command:
```cmd
docker build -t spring .
```
3. Running the Container
Execute the command:
```cmd
docker run -d --name folklore-app spring
```
5. Verifying the Application

Check the container logs with: 
```cmd
docker logs folklore-app
```

## Usage

Explain how to use the application, including any necessary commands.

## License

Include the type of license under which your project is released.


![GitHub commit activity](https://img.shields.io/github/commit-activity/t/PlamMari/Folklore?style=for-the-badge&label=total%20commits&color=lavender)
![GitHub language count](https://img.shields.io/github/languages/count/PlamMari/Folklore?style=for-the-badge&color=lavender)
![GitHub repo size](https://img.shields.io/github/repo-size/PlamMari/Folklore?style=for-the-badge&color=lavender)



