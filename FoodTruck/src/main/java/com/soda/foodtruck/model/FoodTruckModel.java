package com.soda.foodtruck.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class FoodTruckModel{
    public String objectid;
    public String applicant;
    public String facilitytype;
    public String cnn;
    public String locationdescription;
    public String address;
    public String blocklot;
    public String block;
    public String lot;
    public String permit;
    public String status;
    public String x;
    public String y;
    public String latitude;
    public String longitude;
    public String schedule;
    public String received;
    public String priorpermit;
    public Date expirationdate;
    public Location location;
    @JsonProperty(":@computed_region_yftq_j783")
    public String computed_region_yftq_j783;
    @JsonProperty(":@computed_region_p5aj_wyqh")
    public String computed_region_p5aj_wyqh;
    @JsonProperty(":@computed_region_rxqg_mtj9")
    public String computed_region_rxqg_mtj9;
    @JsonProperty(":@computed_region_bh8s_q3mv")
    public String computed_region_bh8s_q3mv;
    @JsonProperty(":@computed_region_fyvs_ahh9")
    public String computed_region_fyvs_ahh9;
    public String fooditems;
    public Date approved;
    public String dayshours;
}

