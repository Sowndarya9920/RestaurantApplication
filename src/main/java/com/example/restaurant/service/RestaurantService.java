package com.example.restaurant.service;

import com.example.restaurant.model.Restaurant;
import com.example.restaurant.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {
    @Autowired
    RestaurantDao restaurantDao;


    public List<Restaurant> getAllRestaurant() {
        return restaurantDao.getRestaurants();
    }

    public String addRestaurant(Restaurant restaurant) {
        boolean status = restaurantDao.save(restaurant);
        if(status)
            return "Data saved";
        else
            return "Inserting failed";
    }

    public Restaurant getRestaurantById(String id) {
        List<Restaurant> listNow = restaurantDao.getRestaurants();
        for(Restaurant restaurant : listNow){
            if(restaurant.getId().equals(id))
                return restaurant;
        }
        return null;
    }

    public String deleteRestaurant(String id) {
        boolean response = false;
        List<Restaurant> listNow = restaurantDao.getRestaurants();
        for(Restaurant restaurant : listNow){
            if(restaurant.getId().equals(id)){
                response = restaurantDao.remove(restaurant);
                if(response)
                    return "Id was deleted";
                else
                    return "Id was not deleted";
            }

        }
        return "Invalid id";
    }

    public String updateRestaurant(String id, String speciality) {
        boolean status = restaurantDao.update(id,Boolean.parseBoolean(speciality));
        if(status)
            return "updated";
        else
            return "Invalid update";
    }
}
