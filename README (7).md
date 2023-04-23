
# Restaurant Application

- The aim of the project is to perform the basic CRUD operations.
- Spring initializer was used to create a spring boot application project.


## Frameworks and Languages used :

- Java
- Spring Boot

## Dependency used :

- Spring web
- Spring Boot Dev Tool

## Data Flow :

## Model : 

- It consists of a Restaurant class which consists of Entity's used to model our data application.
- For each of our data , constructors , getters and setters are created.

## Controller : 

- It consists of RestaurantController class which basically control the flow of data.
- @RestController annotation is used to make the RestaurantController class as controller layer.
- @GetMapping , @PostMapping , @PutMapping , @DeleteMapping annotations are used to perform the CRUD operations.




- ### API Reference :

#### Get all Restaurants

```http
  https://localhost:8080/getAllRestaurant
```

#### Get Restaurant By Id

```http
  https://localhost:8080/getRestaurantById/{id}
```

#### Add Restaurant

```http
  https://localhost:8080/addRestaurant
```

#### Delete Restaurant by Id

```http
  https://localhost:8080/deleteRestaurant/{id}
```

#### Update Restaurant by speciality

```http
  https://localhost:8080/updateRestaurant/{id}
```

## Service : 

- It consists of RestaurantService class which helps us to write the business functionalities.
- @Service annotation is used to make the class as a service layer.

## Repository :

- It consists of RestaurantDao which is used to manage or datas.
- @Repository annotation is used to make the class repository layer.
 


## Summary :

- In this project , I had created the RestApi's performing various CRUD operations such as fetch , save , delete and update restaurants.
- The RestApi's are tested by using Postman which is a client used to test our Api's.

