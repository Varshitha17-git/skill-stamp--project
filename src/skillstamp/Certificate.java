package skillstamp;

public class Certificate {
    private String studentId;
    private String workshopName;
    private String issueDate;

    public Certificate(String studentId, String workshopName, String issueDate) {
        this.studentId = studentId;
        this.workshopName = workshopName;
        this.issueDate = issueDate;
    }

    public String toString() {
        return "Certificate[Student: " + studentId + ", Workshop: " + workshopName + ", Date: " + issueDate + "]";
    }
}
