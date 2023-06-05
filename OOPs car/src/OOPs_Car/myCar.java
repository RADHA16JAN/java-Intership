package OOPs_Car;

public class myCar {
    Engine mycarEngine=EngineSelector.createEngine("Range Rover");
    Tyre myCarTyre=TyreAdapter.createTyres_manufacture("MRF");

    public void buildCar(){
        mycarEngine.intakeAir();

        myCarTyre.fillAir();

    }
}
