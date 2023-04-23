package com.example.restaurant.repository;

import com.example.restaurant.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {
    private List<Restaurant> restaurantList;

    public RestaurantDao(){
        restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant("1","Earl's Secret","Roast Lamb","50","9346288771","12"));
    }


    public List<Restaurant> getRestaurants() {
        return restaurantList;
    }

    public boolean save(Restaurant restaurant) {
        restaurantList.add(restaurant);
        return true;
    }

    public boolean remove(Restaurant restaurant) {
        restaurantList.remove(restaurant);
        return true;
    }

    public boolean update(String id, boolean speciality) {
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getId().equals(id)){
                remove(restaurant);
                restaurant.setSpeciality(String.valueOf(speciality));
                save(restaurant);
                return true;

            }
        }
        return false;
    }
}
