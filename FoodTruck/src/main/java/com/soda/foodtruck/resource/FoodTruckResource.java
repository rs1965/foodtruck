package com.soda.foodtruck.resource;

import com.soda.foodtruck.service.IFoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class FoodTruckResource {

    @Autowired
    IFoodTruck foodTruck;
    @GetMapping("/echo")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/foodtrucks")
    public ResponseEntity<?> getAllFoodTrucks(@RequestParam(name ="status", required=false) String status) throws Exception{

        var foodTrucks = foodTruck.findAllFoodTrucksByStatus(status);

        return foodTrucks;
    }
}
