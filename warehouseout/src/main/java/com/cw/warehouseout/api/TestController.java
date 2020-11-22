package com.cw.warehouseout.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test01")
    public String test01() {
        return "test01";
    }



}



























