package com.EltonFerreira.bookstoremananger.mapper;

import com.EltonFerreira.bookstoremananger.dto.BookDTO;
import com.EltonFerreira.bookstoremananger.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);

}
