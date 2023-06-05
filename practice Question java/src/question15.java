/*
implement a stack data sturucture using array.
     */
import java.util.*;
public class question15 {
  static class stack{
      int arr[],size,top;
      stack(int size){
          this.size=size;
          arr=new int[size];
          top=-1;
      }
      void push(int element){
          if(size-top>1){
              top++;
              arr[top]=element;
          }
          else{
              System.out.println("stack is full and is in overflow state.");
          }
      }
      void pop(){
          if(top>=0){
              top--;
          }
          else{
              System.out.println("Stack is empty and is in underflow state");
          }
      }
      int peek(){
          if(top>=0){
         return arr[top];
      }
          else{
              System.out.println("Stack is empty");
              return -1;
          }
      }
      boolean isEmpty(){
          if(top==-1){
              return true;
          }
          else{
              return false;
          }
      }

  }
       public static void main(String[] args) {
      stack s=new stack(5);
      s.push(5);
      s.push(45);
      s.push(23);


      while(!s.isEmpty()){
          System.out.println(s.peek());
          s.pop();
      }
//      System.out.println(s.peek());
//      s.pop();
//      System.out.println(s.peek());
//      s.pop();
//      System.out.println(s.peek());
//      s.pop();

        }
    }
