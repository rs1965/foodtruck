package com.soda.foodtruck.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HumanAddress {
    @JsonProperty("address")
    public String address;
    @JsonProperty("city")
    public String city;
    @JsonProperty("state")
    public String state;
    @JsonProperty("zip")
    public String zip;

    public HumanAddress(){

    }
    public HumanAddress(String human_address){
        try {
            ObjectMapper mapper = new ObjectMapper();
            HumanAddress h = mapper.readValue(human_address,HumanAddress.class);
            this.address = h.address;
            this.city = h.city;
            this.state = h.state;
            this.zip = h.zip;
        }catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
