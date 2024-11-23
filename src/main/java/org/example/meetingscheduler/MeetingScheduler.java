package org.example.meetingscheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MeetingScheduler {

    private List<MeetingRoom> meetingRoomList;
    private List<User> userList;
    private Calendar calendar ;

    public MeetingScheduler(){
        meetingRoomList = new ArrayList<>();
        userList = new ArrayList<>();
        calendar = new Calendar();

    }

    public List<MeetingRoom> getMeetingRoomList() {
        return meetingRoomList;
    }

    public void setMeetingRoomList(List<MeetingRoom> meetingRoomList) {
        this.meetingRoomList = meetingRoomList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRoomList.add(meetingRoom);
    }

  public Optional<Meeting> scheduleMeeting(
      List<User> users, Interval interval, User organizer, String description) {
    Meeting meeting = null;
    for (MeetingRoom room : meetingRoomList) {
      if (room.addMeetingInterval(interval, users.size())) {
        meeting = new Meeting(description, interval, room, users, organizer);
        calendar.addMeetingToCalendar(meeting);
        break;
      }
    }
    return Optional.of(meeting);
    }

}
