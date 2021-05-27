/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/27/2021
 *   Time: 9:21 AM
 *   File: Home.java
 */

package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @RequestMapping("/home")
    public String home() {
        System.out.println("yha tak aa gya");
        return "success";
    }

    @RequestMapping("/employeeDelete")
    public String employeeDelete(){
        return "success";
    }
}