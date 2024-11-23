package org.example.meetingscheduler;

import java.util.List;

public class Meeting {
    private String description;
    private Interval interval;
    private MeetingRoom meetingRoom;
    private List<User> participants;
    private User organizer;

    public Meeting(String description, Interval interval, MeetingRoom meetingRoom, List<User> participants, User organizer) {
        this.description = description;
        this.interval = interval;
        this.meetingRoom = meetingRoom;
        this.participants = participants;
        this.organizer = organizer;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "description='" + description + '\'' +
                ", interval=" + interval +
                ", meetingRoom=" + meetingRoom +
                ", participants=" + participants +
                ", organizer=" + organizer +
                '}';
    }

    public User getOrganizer() {
        return organizer;
    }

    public void setOrganizer(User organizer) {
        this.organizer = organizer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }
}
