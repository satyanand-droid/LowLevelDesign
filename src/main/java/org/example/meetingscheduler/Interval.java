package org.example.meetingscheduler;

import java.time.LocalDateTime;

public class Interval {
  LocalDateTime from;
  LocalDateTime to;

  public Interval(LocalDateTime from, LocalDateTime to) {
    this.from = from;
    this.to = to;
  }

  @Override
  public String toString() {
    return "Interval{" +
            "from=" + from +
            ", to=" + to +
            '}';
  }

  public LocalDateTime getFrom() {
    return from;
  }

  public void setFrom(LocalDateTime from) {
    this.from = from;
  }

  public LocalDateTime getTo() {
    return to;
  }

  public void setTo(LocalDateTime to) {
    this.to = to;
  }
}
