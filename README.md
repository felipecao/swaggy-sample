# swaggy-sample
Sample project to test Swagger (http://swagger.io) capabilities to document restful api's.

# What does it have
Just a simple Grails restful controller performing CRUD operations over a Person class. Person is made of an id, a name and an address.

# Testing it
## API
When you download and run this sample project, the Person API will be available at http://localhost:8080/swaggy-sample/persons (yes, in plural!). 

To test it, you can use curl ou Postman or whatever. Just make sure you set Content-Type header to 'application/json'. 

To retrieve all Person instances, just invoke GET http://localhost:8080/swaggy-sample/persons.

To create a Person, invoke a POST http://localhost:8080/swaggy-sample/persons, with this json as payload: {"name":"Your name", "address":"Some street"}.

## API Docs
The API docs are automatically generated and are available at http://localhost:8080/swaggy-sample/api/index