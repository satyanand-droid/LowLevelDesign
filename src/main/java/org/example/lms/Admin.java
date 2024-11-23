package org.example.lms;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {

  public Admin(String id, String name, String email) {
    super(id, name, email);
  }

  public List<BookItem> addBook(Book book, Rack rack, int quantity) {
    List<BookItem> bookItems = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      BookItem bookItem = new BookItem(book, rack);
      bookItems.add(bookItem);
    }
    return bookItems;
  }

  public Lending lendBook(BookItem item, Member member) {
    if (!member.checkIsLimitExceeded()) {
      System.out.println("you have already 5 books, no more books can be lend");
      return null;
    }
    Lending lending = new Lending(member, item);
    item.setBorrowed(true);
    return lending;
  }

  public void returnBook(BookItem bookItem) {
    bookItem.setBorrowed(false);
  }
}
