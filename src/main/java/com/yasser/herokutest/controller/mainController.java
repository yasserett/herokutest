package com.yasser.herokutest.controller;

import com.yasser.herokutest.model.Book;
import com.yasser.herokutest.service.imp.BookServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mainController {
    @Autowired
    BookServiceImp service;

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAll(){
        return service.getAll();
    }
}
