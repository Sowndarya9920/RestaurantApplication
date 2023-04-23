package com.example.restaurant.controller;

import com.example.restaurant.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.restaurant.service.RestaurantService;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value="getAllRestaurant")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }

    @PostMapping(value="addRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    @GetMapping(value="getRestaurantById/{id}")
    public Restaurant getRestaurantById(@PathVariable String id){
        return restaurantService.getRestaurantById(id);
    }

    @DeleteMapping(value="deleteRestaurant/{id}")
    public String deleteRestaurant(@PathVariable String id){
        return restaurantService.deleteRestaurant(id);
    }

    @PutMapping(value="updateRestaurant/{id}")
    public String updateRestaurant(@PathVariable String id , @PathVariable String speciality){
        return restaurantService.updateRestaurant(id,speciality);
    }




}
