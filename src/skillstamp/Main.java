package skillstamp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize blockchain
        Blockchain skillStampChain = new Blockchain();

        // Create a workshop
        Workshop workshop = new Workshop("AI Bootcamp", "2025-05-15", "AI Ethics");

        // Add attendees
        workshop.addAttendee("student_0x123");
        workshop.addAttendee("student_0x456");

        // Issue certificates
        for (String studentId : workshop.getAttendees()) {
            String issueDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            Certificate cert = new Certificate(studentId, workshop.getName(), issueDate);
            skillStampChain.addCertificate(cert);
        }

        // Display blockchain
        skillStampChain.displayChain();
    }
}
