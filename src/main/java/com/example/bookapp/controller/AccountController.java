package com.example.bookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bookapp.model.Account;

@Controller
public class AccountController {

    @GetMapping("/account")
    public String accountForm() {
        return "accountform";
    }

    @PostMapping("/createAccount")
    public String createAccount(@RequestParam int accno,
                                @RequestParam String name,
                                @RequestParam double balance,
                                Model model) {
        Account account = new Account(accno, name, balance);
        model.addAttribute("account", account);
        return "accountdetails";
    }
}
