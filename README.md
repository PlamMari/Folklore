![Folklore DB banner](https://github.com/PlamMari/Folklore/blob/master/Folklore_DB%20(2).png)


# Folklore DB

## Description

This is an educational project using Java. It's an application that let's you enter Folklore stories into a database using Hibernate to create your Folklore Encyclopedia. CRUD endpoints have been implemented, where editing is only accessible for users with admin or manager roles. JWT token is used for the user authentication.

## Installation

1. Install Java: Ensure you have Java installed on your system. The project is compatible with Java version 21.
2. Install Gradle: You will need Gradle to build and run the project. Make sure it’s installed and configured properly.
3. Clone the Repository: Clone the project repository from GitHub to your local machine.
4. Configure Build Script: The build.gradle file is already configured with the necessary plugins and dependencies. No changes are required here.
5. Build the Project: Navigate to the project directory and run the following command to build the project:
```cmd
gradle build
```
6. Run the Application: After a successful build, you can run the application using:
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

Here's a summary of the folklore data endpoints and their use:

- GET /api/folklore-entities: This endpoint retrieves all folklore entities. It doesn’t require any parameters and returns a list of FolkloreEntity objects.
- GET /api/folklore-entities/{id}: This endpoint retrieves a specific folklore entity by its ID. The ID is passed as a path variable. If the entity is found, it is returned; otherwise, a 404 status code with a message is returned.
- POST /api/folklore-entities/save: This endpoint creates a new folklore entity. The FolkloreEntity object is passed in the request body. The created entity is returned with a 201 status code.
- PUT /api/folklore-entities/{id}: This endpoint updates a specific folklore entity by its ID. The ID is passed as a path variable and the updated FolkloreEntity object is passed in the request body. If the entity is found and updated, the updated entity is returned; otherwise, a 404 status code is returned.
- DELETE /api/folklore-entities/{id}: This endpoint deletes a specific folklore entity by its ID. The ID is passed as a path variable. If the entity is found and deleted, a success message is returned; otherwise, a 404 status code with a message is returned.

There is also a user controller. This controller utilizes the UserService to interact with user data and handles HTTP requests with appropriate responses. It’s designed to be a part of a RESTful API, managing user-related operations.
- User Registration: Provides an endpoint (/users/register) to register a new user, returning the saved user details.
- User Retrieval: Offers two endpoints to retrieve users:
By ID (/users/{id}): Returns a specific user’s details or a 404 error if not found.
- All Users (/users): Returns a list of all registered users.
- User Update: Includes an endpoint (/users/{id}) to update an existing user’s details, with a success message or a 404 error if the user doesn’t exist.

## License

[MIT](https://choosealicense.com/licenses/mit/)


![GitHub commit activity](https://img.shields.io/github/commit-activity/t/PlamMari/Folklore?style=for-the-badge&label=total%20commits&color=lavender)
![GitHub language count](https://img.shields.io/github/languages/count/PlamMari/Folklore?style=for-the-badge&color=lavender)
![GitHub repo size](https://img.shields.io/github/repo-size/PlamMari/Folklore?style=for-the-badge&color=lavender)



