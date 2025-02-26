//stack collection:-
import java.io.*;
import java.util.*;
class Main{
    
    public static void main(String a[]){
      Stack<Integer> stack=new Stack<Integer>();
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      System.out.println(stack.peek());
      System.out.println(stack);
      stack.pop();
      System.out.println(stack);
    }
}
