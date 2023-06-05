package org.example;

public class carEngine {
    private String manufactures;

    private String noOfStrokes;

    private int speed;

    public carEngine(String m,String noS,int s){
        this.manufactures=m;
        this.noOfStrokes=noS;
        this.speed=s;
    }

    public void openValve(){
//          String controlFlow;
        System.out.println("It will control flow of air and fuel in combustion chamber");

    }

    public void closeValve(){
   System.out.println(" It will close valve");
    }
}

