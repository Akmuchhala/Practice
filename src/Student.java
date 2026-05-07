package src;
import java.util.*;
public class Student {
    private String name;
    private int rollno;
    private double marks;
    public Student(String name, int rollno, double marks){
        this.name=name;
        this.rollno = rollno;
        this.marks=marks;
    }
    public void displayDetails(){
        System.out.println("name = "+name);
        System.out.println("roll no = "+rollno);
        System.out.println("marks = "+ marks);
    }
}
