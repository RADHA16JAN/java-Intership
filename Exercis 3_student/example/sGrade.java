package student.example;
import java.util.Scanner;
public class sGrade {
    private String subject;
    private String grade;

    public sGrade(String s,String g){
        this.grade=g;
        this.subject=s;
    }
    public void totalMarks(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter marks obtained: ");
     int m=sc.nextInt();
     if(m>=33){
         System.out.println("Pass");
     }
     else{
         System.out.println("Fail");
     }

    }


}
