package com.soda.foodtruck.service;

import com.soda.foodtruck.model.sms.SmsRequest;
import com.soda.foodtruck.model.sms.SmsSender;
import com.soda.foodtruck.twilio.TwilioSmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class Service {

    private final TwilioSmsSender smsSender;

    @Autowired
    public Service(@Qualifier("twilio") TwilioSmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void sendSms(SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}