package org.example.meetingscheduler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    MeetingScheduler meetingScheduler = new MeetingScheduler();
    meetingScheduler.addUser(new User("satya", "s@gmail.com"));
    meetingScheduler.addUser(new User("Ankush", "s@gmail.com"));
    meetingScheduler.addUser(new User("bhaskar", "s@gmail.com"));
    meetingScheduler.addUser(new User("raja", "s@gmail.com"));

    meetingScheduler.addMeetingRoom(new MeetingRoom(10));
    meetingScheduler.addMeetingRoom(new MeetingRoom(5));
    LocalDateTime to = LocalDateTime.now();
    LocalDateTime from = LocalDateTime.now();
    Interval interval = new Interval(to, from);
    List<User> meetingParticipants = new ArrayList<>();
    Optional<Meeting> meeting =
        meetingScheduler.scheduleMeeting(
            meetingScheduler.getUserList(),
            interval,
            meetingScheduler.getUserList().get(1),
            "chai pe charcha");
    if (meeting.isPresent()) {
      System.out.println(meeting);
    }
  }
}
