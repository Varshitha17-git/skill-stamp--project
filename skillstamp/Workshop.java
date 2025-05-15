package skillstamp;

import java.util.ArrayList;
import java.util.List;

public class Workshop {
    private String name;
    private String date;
    private String topic;
    private List<String> attendees;

    public Workshop(String name, String date, String topic) {
        this.name = name;
        this.date = date;
        this.topic = topic;
        this.attendees = new ArrayList<>();
    }

    public void addAttendee(String studentId) {
        if (!attendees.contains(studentId)) {
            attendees.add(studentId);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getAttendees() {
        return attendees;
    }
}
