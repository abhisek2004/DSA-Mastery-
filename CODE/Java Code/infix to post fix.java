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
            System.out.print(stack[i]);
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
	    String a="(3+4)*(4+5)";
	    int l=a.length();
	    for(int i=0;i<l;i++){
	        if(a.charAt(i)>='0' && a.charAt(i)<='9'){
	            System.out.print(a.charAt(i));
	        }
	        else{
	            switch(a.charAt(i)){
	                case '+' :
	                    if(top!=-1 && ob.precedence(ob.stack[top])>ob.precedence(a.charAt(i))){
	                        System.out.print(ob.pop());
	                    }
	                    ob.push(a.charAt(i));
	                    break;
	               case '-' :
	                    if(top!=-1 && ob.precedence(ob.stack[top])>ob.precedence(a.charAt(i))){
	                        System.out.print(ob.pop());
	                    }
	                    ob.push(a.charAt(i));
	                    break;
	               case '*' :
	                    if(top!=-1 && ob.precedence(ob.stack[top])>ob.precedence(a.charAt(i))){
	                        System.out.print(ob.pop());
	                    }
	                    ob.push(a.charAt(i));
	                    break;
	               case '/' :
	                    if(top!=-1 && ob.precedence(ob.stack[top])>ob.precedence(a.charAt(i))){
	                        System.out.print(ob.pop());
	                    }
	                    ob.push(a.charAt(i));
	                    break;
	               case '(':
	                   ob.push(a.charAt(i));
	                   break;
	               case ')':
	                   if(ob.stack[top]!=')'){
	                       System.out.print(ob.pop());
	                   }
	                   ob.pop();
	                   break;
	            }
	        }
	    }
	    ob.display();
	}
}
