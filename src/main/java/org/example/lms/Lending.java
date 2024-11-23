package org.example.lms;

import java.time.LocalDateTime;

public class Lending {
  private Member member;
  private BookItem bookItem;
  private LocalDateTime from;
  private LocalDateTime to;

  public Lending(Member member, BookItem bookItem) {
    this.member = member;
    this.bookItem = bookItem;
    this.from = LocalDateTime.now();
    this.to = this.from.plusDays(14);
  }
}
