package com.yasser.herokutest.service;

import com.yasser.herokutest.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    public List<Book> getAll();
}
