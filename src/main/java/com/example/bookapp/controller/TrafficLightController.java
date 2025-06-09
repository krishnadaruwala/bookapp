package com.example.bookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bookapp.model.TrafficLight;

@Controller
public class TrafficLightController {

    @GetMapping("/traffic")
    public String showTrafficForm() {
        return "trafficlight-form";
    }

    @PostMapping("/traffic")
    public String showSelectedLight(@RequestParam String color, Model model) {
        TrafficLight light = new TrafficLight(color);
        model.addAttribute("trafficLight", light);
        return "trafficlight-form";
    }
}
