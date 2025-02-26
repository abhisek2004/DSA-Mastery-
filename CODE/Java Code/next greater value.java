import java.util.*;     //github.com/Anand-29/SRKIT
public class Main
{
    public static void main(String arr[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the data:- ");
     String a=sc.next();
     char [] ar=a.toCharArray();
     int l=a.length();
     int bp=0,t=0;
     int i=-1;
     for( i=l-2;i>=0;i--){
      
     if(ar[i]<ar[i+1]){
             bp=i;
             break;
         }
         
     }
     if(i==-1){
     System.out.print("No Solution");
         return;
     }
     int min=100000;
     for(i=bp+1;i<l;i++){
         if(ar[i]<min && ar[i]>ar[bp]){
             t=i;
         }
     }
     char temp=ar[bp];
     ar[bp]=ar[t];
     ar[t]=temp;
    for(i=bp+1;i<l;i++){
        for(int j=i;j<l;j++){
            if(ar[i]>ar[j]){
                char te=ar[i];
     ar[i]=ar[j];
     ar[j]=te;
            }
        }
    }
    System.out.println("Solution:- ");
   for( i=0;i<ar.length;i++){
       System.out.print(ar[i]);
    }
    }
}
