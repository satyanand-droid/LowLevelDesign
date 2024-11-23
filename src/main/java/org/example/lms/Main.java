package org.example.lms;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Library library = Library.getSingletonLibrary();
    Member member = new Member("1", "satya", "satya@aol.com");
    library.addMember(member);
    Admin admin = new Admin("1", "admin", "admin@aol.com");
    library.addAdmin(admin);
    Author author = new Author();
    List<Author> authors = new ArrayList<>();
    authors.add(author);
    Book book = new Book("santa banta", "santa", authors, 1008, LocalDateTime.now());
    Rack rack = new Rack();
    List<BookItem> bookItems = admin.addBook(book, rack, 1000);
    library.addBooks(bookItems);
    admin.lendBook(bookItems.get(1), member);
    admin.returnBook(bookItems.get(1));
  }
}
