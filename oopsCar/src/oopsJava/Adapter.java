package oopsJava;

public class Adapter {

    public static baseInterface getID (int t){
        baseInterface fileType = null;

        if(t==1){
            fileType = (baseInterface) new txtHandler();
        } else if (t==2) {
            fileType = (baseInterface) new csvHandler();
        }
        else{
            System.out.println("You did not select write option.");
        }

        return fileType;
    }

}
