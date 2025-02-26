//BST:-
class Main{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    public Node insert(Node root,int d){
       
        if(root==null){
            Node newnode=new Node(d);
            return newnode;
        }
        if(d<root.data){
            root.left=insert(root.left,d);
            return root;
        }
        if(d>root.data){
            root.right=insert(root.right,d);
            return root;
        }
        return root;
    }
    public void inorder(Node root){
        
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static void main(String a[]){
        Main tree=new Main();
        Node root=null;
        root=tree.insert(root,10);
        tree.insert(root,6);
        tree.insert(root,12);
        tree.insert(root,11);
        tree.insert(root,13);
        tree.insert(root,3);
        tree.inorder(root);
    }
}
