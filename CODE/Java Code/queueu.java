import java.util.*;
public class Main
{
    int queue[]=new int[10];
    int front=-1;
    int back=-1;
    public void enqueue(int d){
        if(front==-1){
            front=0;
        }
        queue[++back]=d;
    }
    public void dequeue(){
        if(front>back){
            front=-1;
            back=-1;
        }
        else{
        front++;
        }
    }
    public void display(){
        for(int i=front;i<=back;i++){
            System.out.print(queue[i]+" ");
        }
    }
	public static void main(String[] args) {
        Main ob=new Main();
        ob.enqueue(10);
        ob.enqueue(20);
        ob.enqueue(30);
        ob.dequeue();
        ob.dequeue();
        ob.display();
        
	}
}
