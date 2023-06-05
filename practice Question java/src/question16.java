/*
       implement a queue data sturucture using array.
        */
public class question16 {
    static class queue{
        static int arr[],size,rear;
        queue(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
        }
       public static boolean isEmpty(){
            return rear==-1;
        }

        public static boolean isFull(){
            return rear==size-1;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("overflow");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public static  int remove(){
            if(isEmpty()){
                System.out.println("queue is empty.");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        int peek(){
            if(isEmpty()){
                System.out.println("queue is empty.");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {

        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
         //  System.out.println(q.peek());
            System.out.println(q.remove());
        }

    }
}
