package org.example.meetingscheduler;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {
    List<Interval> intervalList;
    private int capacity;

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
        this.intervalList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "MeetingRoom{" +
                "capacity=" + capacity +
                ", intervalList=" + intervalList +
                '}';
    }

    public boolean addMeetingInterval(Interval interval, int participants){
        boolean isEnoughCapacity = checkCapacity(participants);
        boolean isAvailable = checkAvailabilityOfRoom(interval);
        if(isAvailable && isEnoughCapacity){
            intervalList.add(interval);
            return true;
        }
        return false;
    }

    public void removeMeeting(Interval interval){
        intervalList.remove(interval);
    }
    private boolean checkCapacity(int participants) {
        return participants <= capacity;
    }

    private boolean checkAvailabilityOfRoom(Interval newInterval) {
        intervalList.sort((a, b) -> a.getFrom().compareTo(b.getFrom()));

        for (Interval existingInterval : intervalList) {
            // If the new interval starts after the end of this interval,
            // then no need to check further since the intervals are sorted.
            if (newInterval.getFrom().isAfter(existingInterval.getTo())) {
                continue;
            }

            // Check for overlap
            if (newInterval.getTo().isAfter(existingInterval.getFrom())) {
                return false; // Overlap found
            }

            // If newInterval starts before existingInterval starts, we can stop checking.
            // Remaining intervals are guaranteed to start later.
            if (newInterval.getFrom().isBefore(existingInterval.getFrom())) {
                break;
            }
        }
        return true; // No overlap
    }
}
