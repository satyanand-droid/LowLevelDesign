package org.example.meetingscheduler;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    List<Meeting> meetings;

    public Calendar(){
        this.meetings = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "meetings=" + meetings +
                '}';
    }

    public void addMeetingToCalendar(Meeting meeting){
        this.meetings.add(meeting);
    }
}
