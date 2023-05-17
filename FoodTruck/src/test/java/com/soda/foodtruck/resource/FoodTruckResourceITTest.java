package com.soda.foodtruck.resource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FoodTruckResourceITTest {

    @Autowired
    FoodTruckResource foodTruckResource;

    @Test
    void testGetAllFoodTrucks() throws Exception{
        var result = foodTruckResource.getAllFoodTrucks(null);
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    void testGetApprovedFoodTrucks() throws Exception{
        var result = foodTruckResource.getAllFoodTrucks("APPROVED");
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    void testGetInvalidFoodTrucks() throws Exception{
        var result = foodTruckResource.getAllFoodTrucks("INVALID");
        assertEquals(HttpStatus.NOT_FOUND, result.getStatusCode());
    }
}