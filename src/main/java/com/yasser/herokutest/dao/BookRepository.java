package com.yasser.herokutest.dao;

import com.yasser.herokutest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
