# Spring-MVC-project
OOAD project showcasing MVC architecture using Spring Boot and MongoDB

# Dependencies
* `Maven` 
* `Spring Boot`
* `Spring Web`
* `Spring Data Mongodb`
* `Thymeleaf`

# Details of the Project
All the source codes are under the src folder
### Book.java
* The "Model" of the architecture
* contains name, description, author, year of release and rating along with getter and setter functions.
### BookController.java
* The "Controller" of the architecture
* Handles Get requests to /homepage, /viewbooks and /addbook, Post request on form submission and interactions with the mongodb database
### HTML templates
* The "View" of the architecture
* Utilizes thymeleaf engine to handle the model data received from the controller
* Homepage provides links to the ViewBooks and AddBook urls
* ViewBooks show all the models stored in the database
* AddBook provides a form to submit a new entry into the database

### MongoRepo.java
* contains an interface extending Spring's MongoRepository

# Running the Project
* Since the project runs using maven, open a terminal at the project's location and enter the following command:

      mvnw spring-boot:run
* `localhost:8080/` shows the Homepage
* `localhost:8080/viewbooks` shows the table containing all the data
* `localhost:8080/addbook` shows a form asking for the required details 
