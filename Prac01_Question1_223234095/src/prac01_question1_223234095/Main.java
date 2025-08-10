package prac01_question1_223234095;

public class Main {

    public static void main(String[] args) {
        University university = new University();
        // Create courses
        Course course1 = new Course("Software Design II", "SDN260S", 180);
        Course course2 = new Course("Data Structures", "DST210S", 120);
        Course course3 = new Course("Computer Networks", "CNT220S", 150);
        
        university.addCourse(course1);
        university.addCourse(course2);
        university.addCourse(course3);
        
        // Create students
        Student student1 = new Student("John Doe", "215678901");
        Student student2 = new Student("Jane Smith", "218765432");
        
        university.addStudent(student1);
        university.addStudent(student2);
        
        // Register courses
        student1.registerCourse(course1);
        student1.registerCourse(course2);
        student2.registerCourse(course1);
        student2.registerCourse(course3);
        
        // Print registered courses
        for (Student student : university.getStudents()) {  
            student.printRegisteredCourses();
            System.out.println();
        }
    }
}
  
