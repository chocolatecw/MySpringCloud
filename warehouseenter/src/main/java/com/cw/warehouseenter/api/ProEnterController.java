package com.cw.warehouseenter.api;

import com.cw.warehouseenter.client.WarehouseOutClient;
import com.cw.warehouseenter.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/api/enter")
public class ProEnterController {

    @Autowired
    WarehouseOutClient warehouseOutClient;

    @RequestMapping("/requestTest")
    public String requestTest() {
        String userInfo = warehouseOutClient.getUserInfo();
        return userInfo;

    }

    @Value("${testkey}")
    String testkey;

    @RequestMapping("/testKey")
    @ResponseBody
    public String testKey() {
        return testkey;

    }



}

















