package com.EltonFerreira.bookstoremananger.service;


import com.EltonFerreira.bookstoremananger.dto.BookDTO;
import com.EltonFerreira.bookstoremananger.dto.MessageResponseDTO;
import com.EltonFerreira.bookstoremananger.entity.Book;
import com.EltonFerreira.bookstoremananger.mapper.BookMapper;
import com.EltonFerreira.bookstoremananger.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private  BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;


    @Autowired
    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }


    public MessageResponseDTO create(BookDTO bookDTO) {
            Book bookToSave = bookMapper.toModel(bookDTO);

            Book savedBook =  bookRepository.save(bookToSave);
            return MessageResponseDTO.builder()
                .message("Book Created  with ID " + savedBook.getId())
                .build();
    }
    }


