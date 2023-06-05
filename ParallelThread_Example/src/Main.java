
public class Main {
    public static void main(String[] args) {

        ParallelThreadExample m=new ParallelThreadExample();
        Thread t=new Thread(m);
        m.printno(1,1000000);
        t.start();

        ParallelThreadExample m1=new ParallelThreadExample();
        Thread t1=new Thread(m1);
        m1.printno(1,1000000);
        t1.start();

        ParallelThreadExample m2=new ParallelThreadExample();
        Thread t2=new Thread(m2);
        m2.printno(1,1000000);
        t2.start();

        ParallelThreadExample m3=new ParallelThreadExample();
        Thread t3=new Thread(m3);
        m3.printno(1,1000000);
        t3.start();

    }
}