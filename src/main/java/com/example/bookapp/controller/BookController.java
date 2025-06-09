package com.example.bookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bookapp.model.Book;

@Controller
public class BookController {

    @GetMapping("/book")
    public String bookForm() {
        return "bookform";  // matches bookform.html
    }

    @PostMapping("/createBook")
public String createBook(@RequestParam int bookId,
                         @RequestParam String title,
                         @RequestParam String author,
                         @RequestParam(required = false) String price,
                         Model model) {
    Book book;
    if (price == null || price.isEmpty()) {
        book = new Book(bookId, title, author, 0.0);
    } else {
        double p = Double.parseDouble(price);
        book = new Book(bookId, title, author, p);
    }
    model.addAttribute("book", book);
    return "bookdetails";
}

}
