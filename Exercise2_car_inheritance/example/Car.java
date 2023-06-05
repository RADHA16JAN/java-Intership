package org.example;
import java.security.PrivateKey;

public class Car {

    private String carModel;

    private String carType;

    carEngine myCarEngine;

    carClutch myCarClutch;

    carWheel mycarWheel;


    public Car(String cm,String ct,String engineType,String noS,int s,String cType,int noW,String wT){
        myCarEngine=new carEngine(engineType,noS,s);
        myCarClutch = new carClutch(cType);
        mycarWheel=new carWheel(noW,wT);
        this.carModel=cm;
        this.carType=ct;
    }

}

