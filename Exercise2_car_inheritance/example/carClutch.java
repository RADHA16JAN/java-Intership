package org.example;

public class carClutch {
    private String clutchType;

    public carClutch(String ct){
        this.clutchType=ct;
    }

    public void engageClutch(){
    System.out.println("It will allow us to pressing down clutch pedal to reconnect engine and transmission");
    }

    public void disEngageClutch(){
   System.out.println("It will release clutch pedal to disconnect engine and transmission");
    }
}
