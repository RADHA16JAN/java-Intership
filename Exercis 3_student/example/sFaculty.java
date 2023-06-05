package student.example;

import java.util.Scanner;

public class sFaculty {
    private String facultyName;
    private String fCourse;
    private String fDean;
    public sFaculty(String fN,String fC,String fD){
        this.facultyName=fN;
        this.fCourse=fC;
        this.fDean=fD;
    }
    public void totalStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no of students: ");
        int total=sc.nextInt();
        System.out.println("Total no of students in faculty is"+total);
    }

}
