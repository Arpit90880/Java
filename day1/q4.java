//4th
//for loop
import java.util.*;
import java.util.Scanner;
class Math{
 int a;
 int b;
public Math(int a,int b){
    this.a=a;
    this.b=b;
}
}
public class hello{
     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         a=s.nextInt();
         b=s.nextInt();
         int ans=0;
         for(int i=a;i<=b;i++){
             ans+=i;
         }
         System.out.println(ans);    
     } 
}


// while loop
import java.util.*;
import java.util.Scanner;
public class Math{
 int a;
 int b;
public Math(int a,int b){
    this.a=a;
    this.b=b;
}
     public static void main(String []args){
         Scanner s=new Scanner(System.in);
          a=s.nextInt();
          b=s.nextInt();
         int ans=0;
         while(a<=b){
             ans+=a;
             a++;
         }
         System.out.println(ans);
     }
}