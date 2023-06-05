package student.example;
import java.security.PrivateKey;
public class student {

    private int studentRollNo;

    private String studentCourse;



    sInfo studentDetail;
    sGrade studentGrades;

    sFaculty sFacultyDetail;

    public student(int sRNO,String sC,String sN,int age,String pN,String s,String g,String fN,String fC,String fD){
        this.studentRollNo=sRNO;
        this.studentCourse=sC;

        studentDetail=new sInfo(sN,age,pN);
        studentGrades=new sGrade(s,g);
        sFacultyDetail=new sFaculty(fN,fC,fD);
    }


}
