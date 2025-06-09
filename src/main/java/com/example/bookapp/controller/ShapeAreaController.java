package com.example.bookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShapeAreaController {

    @GetMapping("/shape")
    public String showForm() {
        return "shape-form";
    }

    @PostMapping("/shape")
    public String calculateArea(@RequestParam String shape,
                                @RequestParam(required = false) Double radius,
                                @RequestParam(required = false) Double length,
                                @RequestParam(required = false) Double breadth,
                                @RequestParam(required = false) Double base,
                                @RequestParam(required = false) Double height,
                                Model model) {
        double area = 0;
        switch (shape) {
            case "circle" -> {
                if (radius != null)
                    area = Math.PI * radius * radius;
            }
            case "rectangle" -> {
                if (length != null && breadth != null)
                    area = length * breadth;
            }
            case "triangle" -> {
                if (base != null && height != null)
                    area = 0.5 * base * height;
            }
            default -> {
                model.addAttribute("shape", "Invalid shape selected.");
                return "shape-result";
            }
        }

        model.addAttribute("shape", shape);
        model.addAttribute("area", area);
        return "shape-result";
    }
}
