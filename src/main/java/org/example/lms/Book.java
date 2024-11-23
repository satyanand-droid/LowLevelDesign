package org.example.lms;

import java.time.LocalDateTime;
import java.util.List;

public class Book {
  private String name;
  private String publisher;
  private List<Author> authors;
  private int pages;
  private LocalDateTime publishedBook;

  public Book(
      String name, String publisher, List<Author> authors, int pages, LocalDateTime publishedBook) {
    this.name = name;
    this.publisher = publisher;
    this.authors = authors;
    this.pages = pages;
    this.publishedBook = publishedBook;
  }
}
