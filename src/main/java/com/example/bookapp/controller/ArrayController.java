package com.example.bookapp.controller;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArrayController {

    @GetMapping("/array")
    public String showArrayForm() {
        return "array-form";
    }

    @PostMapping("/array")
    public String processArray(@RequestParam String numbers, Model model) {
        try {
            int[] intArray = Arrays.stream(numbers.split(","))
                                   .map(String::trim)
                                   .mapToInt(Integer::parseInt)
                                   .sorted()
                                   .toArray();

            String sorted = Arrays.stream(intArray)
                                  .mapToObj(String::valueOf)
                                  .collect(Collectors.joining(", "));

            model.addAttribute("sorted", sorted);
        } catch (NumberFormatException e) {
            model.addAttribute("sorted", "Invalid input. Please enter only integers separated by commas.");
        }

        return "array-result";
    }
}
