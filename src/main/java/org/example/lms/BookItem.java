package org.example.lms;

public class BookItem {
  private Book book;
  private Rack rack;
  private boolean isBorrowed;

  public BookItem(Book book, Rack rack) {
    this.book = book;
    this.isBorrowed = false;
    this.rack = rack;
  }

  public boolean isBorrowed() {
    return isBorrowed;
  }

  public void setBorrowed(boolean borrowed) {
    isBorrowed = borrowed;
  }
}
