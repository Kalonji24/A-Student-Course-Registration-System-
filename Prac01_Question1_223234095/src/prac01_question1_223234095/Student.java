package prac01_question1_223234095;

import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private ArrayList<Course> registeredCourses;
    
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.registeredCourses = new ArrayList<>();
    }
    
    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }
    
    public void printRegisteredCourses() {
        System.out.println(name + "'s registered courses:");
        for (Course course : registeredCourses) {
            System.out.println(course.getCourseInfo());
        }
    }
}