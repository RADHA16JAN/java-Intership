import java.sql.SQLOutput;
import java.lang.Runnable;
public class ThreadsBasic {
    public static void main(String[] args) {
        System.out.println("main class thread "+Thread.currentThread().getId());
        Thread t=new Thread(new studentThread());
        t.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getId()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static class studentThread implements Runnable{

        @Override
        public void run() {
            //System.out.println("I am in student class in runnable");
            System.out.println("Student class thread "+Thread.currentThread().getId());

            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getId()+" "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
