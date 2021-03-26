import java.util.*;
import java.util.Scanner;
public class Math{
static int a;
static int b;
public Math(int a,int b){
    this.a=a;
    this.b=b;
}
     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         a=s.nextInt();
         b=s.nextInt();
        System.out.println(add(a,b));
        System.out.println(subtract(a,b));
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
     }
     public static int add(int a,int b){
         return a+b;
     }
     public static int subtract(int a,int b){
        if(a>b)
         return (a-b);
        return b-a;
     }
     public static int multiply(int a,int b){
         return a*b;
     }
     public static int divide(int a,int b){
         return a/b;
     }
}
