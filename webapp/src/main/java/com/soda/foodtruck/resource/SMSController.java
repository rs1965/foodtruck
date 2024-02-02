package com.soda.foodtruck.resource;

import com.soda.foodtruck.model.sms.SmsRequest;
import com.soda.foodtruck.service.Service;
import com.soda.foodtruck.twilio.TwilioSmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sms")
public class SMSController {

    @Autowired
    TwilioSmsSender service;
    @PostMapping
    public void sendSms (@RequestBody SmsRequest smsRequest){
        service.sendSms(smsRequest);
    }
}