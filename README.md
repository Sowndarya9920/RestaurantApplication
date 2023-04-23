
# Restaurant Application

- The aim of the project is to perform the basic CRUD operations.
- Spring initializer was used to create a spring boot application project.

![Screenshot (104)](https://user-images.githubusercontent.com/112794922/233850631-14ac95fc-4401-4b21-b999-98a6d772ed54.png)


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

### View
## Get All Restaurants

![image](https://user-images.githubusercontent.com/112794922/233850740-d202a353-75e7-4555-89f0-0a51c0846991.png)

## Add Restaurants

![image](https://user-images.githubusercontent.com/112794922/233850762-7c02a742-1092-4b26-9a7d-08e85ed9a91f.png)

## Get Restaurants By Id

![image](https://user-images.githubusercontent.com/112794922/233850797-b1895476-ac84-47c9-a82a-ebe76998e6b6.png)

 ## Delete Restaurants
 
 ![image](https://user-images.githubusercontent.com/112794922/233850838-5f209a68-e5bf-4065-8a2d-4a824260a5b5.png)
 
![image](https://user-images.githubusercontent.com/112794922/233850848-7614352f-1775-4a51-b56e-785d5526ec86.png)

## Update Restaurants

![image](https://user-images.githubusercontent.com/112794922/233850866-7edcbf82-9ba9-498d-bdbf-a2c3bf1b4c1a.png)



## Summary :

- In this project , I had created the RestApi's performing various CRUD operations such as fetch , save , delete and update restaurants.
- The RestApi's are tested by using Postman which is a client used to test our Api's.

