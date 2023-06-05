package OOPs_Car;

public abstract class Engine implements InterfaceTyre {

    public float Stokes_no;
    public int cc;
    public String Layout_of_engine;
    public abstract void intakeAir();
    public abstract void intakeFuel();
    public abstract void startCompression();

    public abstract void ignite();

}
