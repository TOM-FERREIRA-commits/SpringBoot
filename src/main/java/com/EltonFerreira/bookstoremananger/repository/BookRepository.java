package com.EltonFerreira.bookstoremananger.repository;
import com.EltonFerreira.bookstoremananger.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends  JpaRepository<Book, Long> {
}
