# Java-REST-API-using-Mongo-DB


# Server API Documentation
This is the API documentation for the Server API which provides the endpoints to interact with the server resources.

## Description

#### this code provides a clean and concise way to define the data model for a server entity in a Spring Boot application that uses MongoDB as its database

## Base URL
/server

### API Endpoints
#### Get All Servers
This endpoint retrieves all the servers available in the database.

## Endpoint: /all

#### Method: GET

Response: Returns a list of all the servers with HTTP status code 200 if servers are found, or HTTP status code 404 if there are no servers found.

#### Get Server by ID
This endpoint retrieves a server by its ID.

## Endpoint: /getby/{id}

#### Method: GET

Request Params: id - A string representing the ID of the server.

Response: Returns the server object with HTTP status code 200 if the server is found, or an error message with HTTP status code 404 if the server is not found.

#### Add Server
This endpoint adds a new server to the database.

## Endpoint: /post

#### Method: POST

Request Body: The JSON object representing the server to be added.

Response: Returns a success message with HTTP status code 200 if the server is added successfully.

#### Delete Server
This endpoint deletes a server from the database.

## Endpoint: /delete/{id}

#### Method: DELETE

Request Params: id - A string representing the ID of the server to be deleted.

Response: Returns a success message with HTTP status code 200 if the server is deleted successfully.

#### Update Server
This endpoint updates an existing server in the database.

## Endpoint: /putserver/{id}

#### Method: PUT

Request Params: id - A string representing the ID of the server to be updated.

Request Body: The JSON object representing the updated server.

Response: Returns the updated server object with HTTP status code 200 if the server is updated successfully.

#### Search Server by Name
This endpoint searches for a server by its name.

## Endpoint: /searchby/{name}

#### Method: GET

Request Params: name - A string representing the name of the server.

Response: Returns a list of servers matching the search query with HTTP status code 200 if servers are found, or HTTP status code 404 if no servers are found.
 
 # server model class
This class represents the data model for a server entity. 

It uses the Lombok library to generate getters, setters, constructors and other boilerplate code automatically, reducing the amount of code that needs to be written manually.

### Fieldsname:
 - A string that represents the name of the server.

- id: A string that represents the unique identifier of theserver.

- lang: A string that represents the programming language used by the server.

- framework: A string that represents the web framework used by the server.

## Methods
#### getName(): Returns the name of the server.

#### setName(String name): Sets the name of the server.
#### getId(): Returns the ID of the server.
#### setId(String id): Sets the ID of the server.
#### getLang(): Returns the programming language used by the server.
#### setLang(String lang): Sets the programming language used by the server.
#### getFramework(): Returns the web framework used by the server.
#### setFramework(String framework): Sets the web framework used by the server.
## @Document Annotation
This annotation from Spring Data MongoDB library indicates that this class is a MongoDB document and it should be mapped to the corresponding collection in the MongoDB database.

## @Id Annotation
This annotation is used to mark a field as the primary identifier for the corresponding document in the MongoDB collection. In this case, the name field is used as the primary identifier.

 ## MongoDB as its database

 #### mongodb.host: The hostname or IP address of the MongoDB server. 
 #### In this case, it is set to 127.0.0.1, which is the loopback address for the local machine.
#### mongodb.port: The port number that the MongoDB server is listening on. In this case, it is set to 27017, which is the default port for MongoDB.
#### mongodb.database: The name of the database to connect to. In this case, it is set to bala.

## Postman
#### postman tool was used to send the HTTP Requests and Responses.








## Screenshots
## GETallServers
![getallservers](https://user-images.githubusercontent.com/94130131/228649338-b6a56123-2063-4bbe-b129-a6615e20069a.PNG)

## POSTbyID

![post](https://user-images.githubusercontent.com/94130131/228649466-976167c1-a30b-4e60-a0d8-9d0d26e6e993.PNG)

## GETbyNAME

![search by name](https://user-images.githubusercontent.com/94130131/228649499-b55b9956-23df-421d-bd7c-a14f295e1db4.PNG)

## DELETEbyID
![delete](https://user-images.githubusercontent.com/94130131/228651173-624e7c7c-aaa7-46ec-902c-6f6403724566.PNG)

## GETbyID

![getbyID](https://user-images.githubusercontent.com/94130131/228651499-a55e71dc-c860-40bc-964d-3bad44841f84.PNG)

