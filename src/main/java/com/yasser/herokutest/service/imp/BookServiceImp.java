package com.yasser.herokutest.service.imp;

import com.yasser.herokutest.dao.BookRepository;
import com.yasser.herokutest.model.Book;
import com.yasser.herokutest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {
    @Autowired
    private BookRepository repo;

    @Override
    public List<Book> getAll() {
        return repo.findAll();
    }
}
