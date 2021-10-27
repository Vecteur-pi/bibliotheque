package com.udemy.bibiotheque.book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class BookController {
    @GetMapping(value = "/books")
    public  ResponseEntity listBooks(){
        Book book  = new  Book();
        book.setTitle("LePi");
        book.setCategory(new Category("BD"));

        return new ResponseEntity(Arrays.asList(book), HttpStatus.OK);
    }

    @PostMapping(value = "/books")
    public  ResponseEntity addBook ( Book book){
        return  new ResponseEntity(book, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/books/{bookId}")
    public ResponseEntity deletebook(@PathVariable("bookId") String bookId){
        return new ResponseEntity((HttpStatus.NO_CONTENT));
    }

    @PutMapping (value = "/books/{bookId}")
    public ResponseEntity updatebook(@PathVariable("bookId") String bookId){
        return new ResponseEntity(HttpStatus.OK);
    }
}
