package com.example.bookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookapp.model.VowelCounter;

@Controller
public class VowelController {

    @GetMapping("/vowel")
    public String showForm(Model model) {
        model.addAttribute("vowelCounter", new VowelCounter());
        return "vowel-form";
    }

    @PostMapping("/vowel")
    public String processText(@ModelAttribute VowelCounter vowelCounter, Model model) {
        int count = vowelCounter.countVowels();
        model.addAttribute("text", vowelCounter.getText());
        model.addAttribute("count", count);
        return "vowel-result";
    }
}
