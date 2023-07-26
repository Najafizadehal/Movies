# Movies
This code is a Spring Boot application that provides a web service for managing movies and their reviews.

The `MovieController` class is a Spring MVC controller that allows users to retrieve a list of all movies or a specific movie by its ID.
This class uses `MovieService` to provide the data.

`MovieService` is a service that depends on `MovieRepository` and uses it to communicate with a MongoDB database.
This class provides functions for retrieving all movies or a specific movie by its ID.

`MovieRepository` is a Spring Data interface that is used to access movie data in the MongoDB database.

`ReviewController` is a Spring MVC controller that allows users to create a new review for a specific movie.

`ReviewService` is a service that depends on `ReviewRepository` and uses it to communicate with a MongoDB database.
This class provides a function for creating a new review for a specific movie. Additionally, this class uses `MongoTemplate` to add review information to the corresponding movie.
