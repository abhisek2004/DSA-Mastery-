import java.util.*;
class Main{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
        Node root=null;
        public Node insert(Node root,int d){
            if(root==null){
                 Node newnode=new Node(d);
                 return newnode;
            }
            else if(root.data>d){
                root.right=insert(root.right,d);
            }
            else if(root.data<d){
                root.left=insert(root.left,d);
            }
            return root;
        }
        public void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        public void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
        public void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data);
        }
        public int height(Node root){
            if(root==null){
                return 0;
            }
            else{
                if(height(root.left)>height(root.right)){
                    return 1+height(root.left);
                }
                else{
                    return 1+height(root.right);
                }
            }
        }
        public void levelorder(Node root){
            int h=height(root);
            for(int i=1;i<=h;i++){
                levelsolution(root,i);
            }
        }
        public void levelsolution(Node root,int level){
            if(root==null){
                return;
            }
            if(level==1){
                System.out.print(root.data);
            }
            else if(level>1){
                levelsolution(root.left,level-1);
                levelsolution(root.right,level-1);
            }
        }
        public boolean isBst(Node root,int max,int min){
            if(root==null){
                return true;
            }
            else if(root.data<min && root.data>max){
                return false;
            }
            else{
                return isBst(root.left,root.data,min)
                 && isBst(root.right,max,root.data);
            }
        }
        public void BST(Node root){
            if(isBst(root,1000,-1000)==true){
                System.out.print("BST");
            }
            else{
                System.out.print("Not a BST");
            }
        }
        public int maximum(Node root){
            if(root.left==null){
                return root.data;
            }
            else{
                return maximum(root.left);
            }
        }
        public int minimum(Node root){
            if(root.right==null){
                return root.data;
            }
            else{
                return minimum(root.right);
            }
        }
        public void leftborder(Node root){
            if(root==null){
                return;
            }
            else{
                System.out.print(root.data);
                leftborder(root.left);
            }
        }
        public void rightborder(Node root){
            if(root==null){
                return;
            }
            else{
                System.out.print(root.data);
                rightborder(root.right);
            }
        }
        public void bottomborder(Node root){
            if(root==null){
                return;
            }
            if(root.left==null || root.right==null){
                System.out.print(root.data);
            }
            bottomborder(root.left);
            bottomborder(root.right);
        }
        public int sum(Node root,int sum){
            if(root==null){
                return sum;
            }
            else{
            sum+=root.data;
            return sum(root.left,sum)+
            sum(root.right,sum);
        }
        }
        public static void main(String arr[]){
            Main tree=new Main();
            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println("press 1 to insert data");
                System.out.println("press 2 for inorder");
                System.out.println("press 3 for preorder");
                System.out.println("press 4 for postorder");
                System.out.println("press 5 for levelorder");
                System.out.println("press 6 for leftborder");
                System.out.println("press 7 for rightborder");
                System.out.println("press 8 for bottomborder");
                System.out.println("press 9 for maximum");
                System.out.println("press 10 for minimum");
                System.out.println("press 11 for height");
                System.out.println("press 12 to validate bst");
                System.out.println("press 13 for sum");
                int a=sc.nextInt();
                switch(a){
                        case 1:
                            System.out.println("Enter the data");
                            a=sc.nextInt();
                            if(tree.root==null){
                                tree.root=tree.insert(tree.root,a);
                            }
                            else{
                                tree.insert(tree.root,a);
                            }
                        break;
                        case 2:
                            System.out.println("inorder is:-");
                            tree.inorder(tree.root);
                        break;
                        case 3:
                            System.out.println("preorder is:-");
                            tree.preorder(tree.root);
                        break;
                        case 4:
                            System.out.println("postorder is:-");
                            tree.postorder(tree.root);
                        break;
                        case 5:
                            System.out.println("levelorder is:-");
                            tree.levelorder(tree.root);
                        break;
                        case 6:
                            System.out.println("height"+ tree.height(tree.root));
                        break;
                        case 7:
                            System.out.println("maximum"+ tree.maximum(tree.root));
                        break;
                        case 8:
                            System.out.println("minimum"+ tree.minimum(tree.root));
                        break;
                        case 9:
                            System.out.println("sum"+ tree.sum(tree.root,0));
                        break;
                        case 10:
                            System.out.println("leftborder:-");
                            tree.leftborder(tree.root);
                        break;
                        case 11:
                            System.out.println("rightborder:-");
                            tree.rightborder(tree.root);
                        break;
                        case 12:
                            System.out.println("bottomborder:-");
                            tree.bottomborder(tree.root);
                        break;
                        case 13:
                            tree.BST(tree.root);
                        break;
                        case 14:
                            return;
                }
                
            }
            
    }
}
