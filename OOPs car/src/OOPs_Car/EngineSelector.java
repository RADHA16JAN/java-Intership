package OOPs_Car;

public class EngineSelector {
    public static Engine createEngine(String EngineManufacturer) {
        Engine carEngine=null;
        if(EngineManufacturer.equals("Range Rover")){
            carEngine=new RangeRover();
        } else if (EngineManufacturer.equals("Skoda")) {
            carEngine = new Skoda();
        }
        else{
            System.out.println("Please choose what we have in system/");
        }
        return carEngine;
    }
}
