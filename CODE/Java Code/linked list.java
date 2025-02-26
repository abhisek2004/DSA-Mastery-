//list insertion at before & end:-
class Main{
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    void insertend(int d){
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
        }
    }
    void insertbefore(int d){
        Node newnode=new Node(d);
        newnode.next=head;
        head=newnode;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String a[]){
        Main list=new Main();
        list.insertbefore(1);
        list.insertbefore(2);
        list.insertbefore(3);
        list.insertend(4);
        list.insertend(5);
        list.insertend(6);
        list.print();
    }
}
