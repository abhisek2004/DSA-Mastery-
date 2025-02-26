import java.util.*;
public class Main
{
    char stack[]=new char[10];
    static int top=-1;
    public void push(char d){
        if(top==10){
            System.out.println("overflow");
        }
        else{
            stack[++top]=d;
        }
    }
    public char pop(){
        if(top==-1){
            System.out.println("underflow");
            return 0;
        }
        else{
            return stack[top--];
        }
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.print((int)stack[i]-48);
        }
        System.out.println();
    }
    public int precedence(char a){
        switch(a){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                 return -1;
        }
    } 
	public static void main(String[] args) {
		Main ob=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the expression:- ");
		String a=sc.next();
		String b="";
	    int l=a.length();
	    for(int i=0;i<l;i++){
	        if(a.charAt(i)>='0' && a.charAt(i)<='9'){
	            b+=a.charAt(i);
	        }
	        else{
	            switch(a.charAt(i)){
	                case '+' :
	                    if(top!=-1 && ob.precedence(ob.stack[top])>ob.precedence(a.charAt(i))){
	                        b+=ob.pop();
	                    }
	                    ob.push(a.charAt(i));
	                    break;
	               case '-' :
	                    if(top!=-1 && ob.precedence(ob.stack[top])>ob.precedence(a.charAt(i))){
	                        b+=ob.pop();
	                    }
	                    ob.push(a.charAt(i));
	                    break;
	               case '*' :
	                    if(top!=-1 && ob.precedence(ob.stack[top])>ob.precedence(a.charAt(i))){
	                        b+=ob.pop();
	                    }
	                    ob.push(a.charAt(i));
	                    break;
	               case '/' :
	                    if(top!=-1 && ob.precedence(ob.stack[top])>ob.precedence(a.charAt(i))){
	                        b+=ob.pop();
	                    }
	                    ob.push(a.charAt(i));
	                    break;
	               case '(':
	                   ob.push(a.charAt(i));
	                   break;
	               case ')':
	                   if(ob.stack[top]!='('){
	                       b+=ob.pop();
	                   }
	                   ob.pop();
	                   break;
	            }
	        }
	    }
	    for(int i=top;i>=0;i--){
            b+=ob.stack[i];
        }
	    System.out.println("post fix convertion :- "+ b );
	    //Post fix eval
	    top=-1;
	    l=b.length();
	    for(int i=0;i<l;i++){
	        if(b.charAt(i)>='0' && b.charAt(i)<='9'){
	            ob.push(b.charAt(i));
	        }
	        else{
	            int v1=(int)ob.pop()-48;
	            int v2=(int)ob.pop()-48;
	            switch(b.charAt(i)){
	                case '+':
	                    ob.push((char)(v1+v2+48));
	                break;
	                case '-':
	                    ob.push((char)(v1-v2+48));
	                break;
	                case '*':
	                    ob.push((char)(v1*v2+48));
	                break;
	                case '/':
	                    ob.push((char)(v1/v2+48));
	                break;
	            }
	        }
	        
	    }
	   System.out.print("Solution :- ");
	        ob.display(); 
	}
}
