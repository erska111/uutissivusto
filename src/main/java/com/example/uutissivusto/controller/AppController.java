/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.uutissivusto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Eero Tirkkonen
 */
@Controller
public class AppController {
    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Suomi 100 perkele!test";
    }
    
}
