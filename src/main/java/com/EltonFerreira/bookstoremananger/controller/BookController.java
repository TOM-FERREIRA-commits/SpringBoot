package com.EltonFerreira.bookstoremananger.controller;

import com.EltonFerreira.bookstoremananger.dto.MessageResponseDTO;
import com.EltonFerreira.bookstoremananger.entity.Book;
import com.EltonFerreira.bookstoremananger.repository.BookRepository;
import com.EltonFerreira.bookstoremananger.service.BookService;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")

public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book) {
        return BookService.create(book);
    }
}
