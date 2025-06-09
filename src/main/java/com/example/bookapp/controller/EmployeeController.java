package com.example.bookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookapp.model.Employee;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employeeform"; // matches employeeform.html
    }

    @PostMapping("/createEmployee")
    public String submitForm(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "employeeresult"; // matches employeeresult.html
    }
}
