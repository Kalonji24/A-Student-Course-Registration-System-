package prac01_question1_223234095;

public class Course {
    private String courseName;
    private String courseCode;
    private int credit;
    
    public Course(String courseName, String courseCode, int credit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credit = credit;
    }
    
    public String getCourseInfo() {
        return courseName + " (" + courseCode + "), " + credit + " credits";
    }
}