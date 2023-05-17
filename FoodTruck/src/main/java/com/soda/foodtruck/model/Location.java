package com.soda.foodtruck.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Location{
    public String latitude;
    public String longitude;
    public HumanAddress human_address;
}