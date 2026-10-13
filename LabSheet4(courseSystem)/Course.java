package coursesystem;

import java.util.ArrayList;


public class Course {
    
    String courseName;
    int capacity;
    ArrayList<Student>enrolledStudents;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        enrolledStudents= new ArrayList<Student>();
    }
    
    public Course(){
        
    }
    
    public void display(){
        System.out.println("Course name: "+this.courseName);
        System.out.println("Capacity: "+this.capacity);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
