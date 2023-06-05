public class question1 {
    public static void main(String[] args) {

        /*
        1. Declare 5 variables
		int a = 21
		int b = 6
		int c = 3
		int d = 1
	1a. Print result of a - b / c
	1b. Print result of (a - b) / c
	1c. print result of a/b*c+d
	1d. print result of a/(b*(c+d))

         */
        int a=21,b=6,c=3,d=1;
        int e=a-b/c;
        int f=(a-b)/c;
        int g=a/b*c+d;
        int h=a/(b*(c+d));
        System.out.println("a-b/c = "+" "+e);
        System.out.println("(a - b) / c = "+" "+f);
        System.out.println("a/b*c+d = "+" "+g);
        System.out.println("a/(b*(c+d)) = "+" "+h);
    }
}
