package org.example.lms;

import java.util.ArrayList;
import java.util.List;

public class Member extends User {
  private static int MAX_BOOK_ALLOWED = 5;

  private List<BookItem> borrowed;
  private int noOfBooksBorrowed;

  public Member(String id, String name, String email) {
    super(id, name, email);
    this.noOfBooksBorrowed = 0;
    this.borrowed = new ArrayList<>();
  }

  public void addToBorrowedBooks(BookItem bookItem) {
    borrowed.add(bookItem);
    this.noOfBooksBorrowed++;
  }

  public boolean checkIsLimitExceeded() {
    return noOfBooksBorrowed < MAX_BOOK_ALLOWED;
  }
}
