package com.example.bookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookapp.model.Calculator;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String showForm(Model model) {
        model.addAttribute("calculator", new Calculator());
        return "calculator-form";
    }

    @PostMapping("/calculator")
    public String calculate(@ModelAttribute Calculator calculator, Model model) {
        calculator.calculate();
        model.addAttribute("result", calculator.getResult());
        return "calculator-result";
    }
}


