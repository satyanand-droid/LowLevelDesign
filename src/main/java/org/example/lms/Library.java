package org.example.lms;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private static Library library = null;
  private List<Admin> admins = null;
  private List<Member> members = null;
  private List<BookItem> bookItems = null;

  private Library() {
    admins = new ArrayList<>();
    members = new ArrayList<>();
    bookItems = new ArrayList<>();
  }

  public static Library getSingletonLibrary() {
    if (library == null) {
      return new Library();
    }
    return library;
  }

  public List<Admin> addAdmin(Admin admin) {
    admins.add(admin);
    return admins;
  }

  public List<Member> addMember(Member member) {
    members.add(member);
    return members;
  }

  public List<BookItem> addBooks(List<BookItem> bookItems) {
    this.bookItems.addAll(bookItems);
    return this.bookItems;
  }
}
