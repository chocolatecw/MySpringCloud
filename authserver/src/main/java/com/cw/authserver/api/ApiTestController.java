package com.cw.authserver.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/test")
public class ApiTestController {

    @RequestMapping("/test01")
    public String test01() {
        return "test01";
    }

    @RequestMapping(value = "/getCurUser", method = RequestMethod.GET)
    public Principal getCurUser(Principal principal) {
        return principal;
    }


}
