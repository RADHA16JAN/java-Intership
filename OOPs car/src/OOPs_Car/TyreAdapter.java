package OOPs_Car;

public class TyreAdapter {
    public static Tyre createTyres_manufacture(String Type) {
       Tyre carTyre=null;
       if(Type.equals("MRF")){
           carTyre=new MRF_tyre();
       } else if (Type.equals("Ceat")) {
           carTyre=new Ceat_Tyre();
       }
        return carTyre;
    }
}
