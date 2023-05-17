package com.soda.foodtruck.service;

import org.springframework.http.ResponseEntity;

public interface IFoodTruck {
    ResponseEntity<?> findAllFoodTrucksByStatus(String status) throws Exception;
}
