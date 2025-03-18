package com.EltonFerreira.bookstoremananger.service;


import com.EltonFerreira.bookstoremananger.dto.MessageResponseDTO;
import com.EltonFerreira.bookstoremananger.entity.Book;
import com.EltonFerreira.bookstoremananger.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private static BookRepository bookRepository;


    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public static MessageResponseDTO create(Book book) {
        Book savedBook =  bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book Created  with ID " + savedBook.getId())
                .build();
    }
    }


