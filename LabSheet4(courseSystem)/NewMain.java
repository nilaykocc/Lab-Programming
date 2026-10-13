
package coursesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class NewMain {

   
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        ArrayList<Course>coursess=new ArrayList<>();
        
        System.out.println("How many courses there are? ");
        int courseCount=scanner.nextInt();
        
        for(int i=0;i<courseCount;i++){
            System.out.println("Course name: ");
            String name=scanner.next();
            
            System.out.println("The capacity of the class: ");
            int capacity=scanner.nextInt();
            
            Course c1=new Course(name,capacity);
            coursess.add(c1);
            
            
            
        }
        for(Course cs:coursess){
            cs.display();
        }
        
         System.out.println(" Student Id: ");
            String sId=scanner.next();
            
            System.out.println("Student name:  ");
            String sName=scanner.next();
        
            Student s1=new Student(sId,sName);
            System.out.println("Enter course name: ");
            String ecourname=scanner.next();
            
            boolean a=false;
            Course aa=new Course();
          for(Course bjk: coursess){
              if(bjk.equals(bjk.courseName)){
                  aa=bjk;
                  a=true;
              }
          }
                  
        if(a==false){
           System.out.println("There is no couse with that name");
        }else{
            if(aa.capacity>aa.enrolledStudents.size()){
                boolean b=true;
                
                for(Student idd:aa.enrolledStudents){
                    if(idd.studentId.equals(s1.studentId)){
                        b=false;
                    }
                }
                        if(b==false){
                            System.out.println("This studentis already registered");
                        }else{
                            aa.enrolledStudents.add(s1);
                            System.out.println("Its successful registreted.HELLO:)");
                        }
                        
            }else{
                System.out.println("The course is full");
            }
        }
           for(Course cs:coursess){
            cs.display();
            cs.enrolledStudents.size();
            for(Student st:cs.enrolledStudents){
                st.info();
            }
           }
        
        
        
          
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
