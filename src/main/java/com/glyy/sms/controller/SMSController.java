package com.glyy.sms.controller;

import com.glyy.sms.pojo.MobileCodeWS;
import com.glyy.sms.pojo.MobileCodeWSSoap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {
    @RequestMapping(value="/SMS", method = RequestMethod.GET)
    public String sendSMS(@RequestParam(value="phoneNumber",required = true) String phoneNumber){
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        MobileCodeWSSoap soap= mobileCodeWS.getMobileCodeWSSoap();

        String response= soap.getMobileCodeInfo(phoneNumber,null);
        return response;

    }
}
