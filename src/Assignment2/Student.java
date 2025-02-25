package Assignment2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person implements IPerson {
    private float gpa;
    private String major;

    // Constructor
    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    // Getters and Setters
    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Implement the displayInfo method from IPerson
    @Override
    public void displayInfo() {
        // Define the date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + dateFormat.format(getDateOfBirth()));
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}
