# REST API Sales platform

Following technologies stack being used:

- Spring Boot 2.1.2.RELEASE
- Maven
- JDK 1.8
- H2
- Intellij IDEA

# Testing API
Use Intelij IDEA to build and run the project. To test this API, I used an external client POSTMAN(An extension from CHROME).

1. Retrieve all items

Open POSTMAN tool, select request type [GET for this usecase], specify the uri http://localhost:8080/api/items/ and send, should retrieve all items.

2. Retrieve a single item

Use GET, specify the id of the item you are loooking for and send. For example:
http://localhost:8080/api/items/1

3. Create a new item

http://localhost:8080/api/items/
Use POST, specify the content in body, select content-type as 'application/json'. For example:
{
  "id": null,
  "title": "Basketball shoes",
  "description": "Nike shoes for basketball",
  "price": 89.99,
  "stock": "Available on stock",
  "location": "Vilnius, Lithuania, Ozo str. 25, 54.709925, 25.259397"
}

4. Delete an item

Use DELETE, specify the id in url, send. User should be deleted from server. For example:
http://localhost:8080/api/items/2

5. Update an item

Use PUT, specify the content in body and select content-type as 'application/json'. For example:
http://localhost:8080/api/items/4

{
  "id": null,
  "title": "Basketball shoes",
  "description": "Nike shoes for basketball",
  "price": 49.99,
  "stock": "Not available on stock",
  "location": "Vilnius, Lithuania, Ozo str. 25, 54.709925, 25.259397"
}

To access the h2 database, open the following url: http://localhost:8080/h2/ (First of all, to access the url, You need to build and run the project)
