//Queue using list:-
import java.io.*;
import java.util.*;
class Main{
    
    public static void main(String a[]){
      Queue<Integer> q=new LinkedList<Integer>();
      q.add(10);
      q.add(20);
      q.add(30);
      q.add(40);
      System.out.println(q.peek());   //print first element
      System.out.println(q);
      q.remove();                     //remove first data
      System.out.println(q.poll());   //print & remove first element
      System.out.println(q);
    }
}
