package com.dbh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "dbh")
public class DBHController {

    Logger logger = LoggerFactory.getLogger(DBHController.class);

    @GetMapping
    public ResponseEntity<Object> hello() {
        List<String> lists = Arrays.asList("Apple", "Orange", "Grapes");
        logger.info("My fruit lists: {}", lists);
        return new ResponseEntity<>(lists, HttpStatus.OK);
    }
}
