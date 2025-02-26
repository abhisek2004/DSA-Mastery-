public class Main{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    Node root1=null;
    Node root2=null;    
    public Node newnode(int d){
        Node nn=new Node(d);
        return nn;
    }
    public boolean mirror(Node root1,Node root2){
        if(root1==null && root2==null)
        return true;
        if(root1==null || root2==null)
                return false;
        else
        return root1.data==root2.data &&
        mirror(root1.left, root2.right) &&
        mirror(root1.right, root2.left);
    }
    public static void main(String []arr){
        Main ob=new Main();
        ob.root1=ob.newnode(10);
        ob.root1.left=ob.newnode(5);
        ob.root1.right=ob.newnode(15);
        ob.root2=ob.newnode(10);
        ob.root2.left=ob.newnode(15);
        ob.root2.right=ob.newnode(5);
        if(ob.mirror(ob.root1,ob.root2))
        System.out.print("mirrored");
        else
        System.out.print("not mirrored");
                
    }
}
