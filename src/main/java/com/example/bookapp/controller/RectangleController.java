package com.example.bookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookapp.model.Rectangle;

@Controller
public class RectangleController {

    @GetMapping("/rectangle")
    public String showForm(Model model) {
        model.addAttribute("rectangle", new Rectangle());
        return "rectangle-form";
    }

    @PostMapping("/rectangle")
    public String calculate(@ModelAttribute Rectangle rectangle, Model model) {
        model.addAttribute("area", rectangle.getArea());
        model.addAttribute("perimeter", rectangle.getPerimeter());
        return "rectangle-result";
    }
}
