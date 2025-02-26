import java.util.*;

public class merge {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node insert(Node head, int d) {
        Node newnode = new Node(d);
        if (head == null) {
            head = newnode;
            return head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            return head;
        }
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String arr[]) {
        Main ob = new Main();
        Node head1 = null;
        Node head2 = null;
        Node head3 = null;
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            System.out.println("press 1 to insert data in the first list");
            System.out.println("press 2 to insert data in the second list");
            System.out.println("press 3 to merge the lists");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.print("Enter the value of list and press -1 to exit");
                    while (true) {
                        a = sc.nextInt();
                        if (a < 0)
                            break;
                        if (head1 == null) {
                            head1 = ob.insert(head1, a);
                        } else {
                            ob.insert(head1, a);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter the value of list and press -1 to exit");
                    while (true) {
                        a = sc.nextInt();
                        if (a < 0)
                            break;
                        if (head2 == null) {
                            head2 = ob.insert(head2, a);
                        } else {
                            ob.insert(head2, a);
                        }
                    }
                    break;
                case 3:
                    head3 = ob.merge(head1, head2, head3);
                    System.out.print("List's are merged");
                    break;

            }
        }
    }
}

// list 1 = 1 4 6 7 8
// list 2 = 2 3 10 12
// list 3= 1 2 3 4 6 7 8 10 12
