public class question3 {
    public static void main(String[] args) {
        /*
         Declare 5 variables as below
	float a = <put value>
	double b = <Put value>
	byte c = <Put Value>
	short d = <Put Value>
	long e = <Put Value>

	short result = <Type cast it to short> e
	short result_2 = <type cast it to short> (c - e)
	short result_3 = <type cast it to short> e - a

	//Try other combinations of long to int, int to short, doublt to float, float to byte -- reducing.


         */
 // bscilfd
        float a=1.23f;
        double b=2.3;
        byte c =2;
        short d=6;
        long e=165 ;

        short result=(short)e;
        short result_2=(short)(c-e);
        short result_3= (short) ((short)e-a);

        System.out.println(result);
        System.out.println(result_2);
        System.out.println(result_3);

        //Try other combinations of long to int, int to short, doublt to float, float to byte -- reducing.

        // long to int
        int f=(int) e;
        System.out.println(f);

        // int to short
        int g=65;
        short h=(short) g;
        System.out.println(h);

        //double to float
        float i=(float) b;
        System.out.println(i);


        //float to byte
        byte j=(byte)a;
        System.out.println(j);


        // Try other combination of int to long , short to long, float to double, byte to float -- expanding.

       //int to long
        long k=g;
        System.out.println(k);

        //short to long
        long l=d;
        System.out.println(l);

        //float to double
        double m=  b;
        System.out.println(m);


        //byte to float
        float n=c;
        System.out.println(n);


    }
}

