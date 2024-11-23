package org.example.lms;

import java.util.HashMap;
import java.util.List;

public class Catalog {

  private HashMap<String, List<Book>> searchByName;
  private HashMap<String, List<Book>> searchByAuthorName;

  public Catalog() {
    this.searchByName = new HashMap<>();
    this.searchByAuthorName = new HashMap<>();
  }

  public List<Book> searchByName(String name) {
    return searchByName.get(name);
  }

  public List<Book> searchByAuthorName(String authorName) {
    return searchByAuthorName.get(authorName);
  }
}
