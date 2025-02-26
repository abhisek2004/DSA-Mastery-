import java.util.*;
public class Main{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    public void insert(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=temp;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void solution(int n){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(n>1){
            temp=temp.prev;
            n--;
        }
        System.out.print(temp.data);
    }
    public static void main(String arr[]){
     Main ob=new Main();
     ob.insert(10);
     ob.insert(20);
     ob.insert(30);
     ob.insert(40);
     ob.insert(50);
     ob.insert(60);
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     ob.solution(n);
    }
}



  // 
