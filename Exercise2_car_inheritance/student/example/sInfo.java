package student.example;

import java.util.Scanner;

public class sInfo {
    private String sName;
    private int sAge;

    private String parentName;

    public sInfo(String sN,int sAge,String pName){
        this.sName=sN;
        this.sAge=sAge;
        this.parentName=pName;
    }

    public void sAddress(){
        String sA;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student address: ");
        sA=sc.next();
        System.out.println("student address is"+sA);
    }
}
