package com.cw.warehouseout.api;

import com.cw.warehouseout.model.UserInfo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RestController
@RequestMapping("/api/output")
public class ProOutputController {

    @RequestMapping("/getUserInfo")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getUserInfo() {
        Object user = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
//        String email = user.getUsername() + "@spring2go.com";

//        UserInfo userInfo = new UserInfo(user.getUsername(), email);

        return "success";

    }



}
