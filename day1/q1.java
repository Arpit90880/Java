//1st
import java.util.*;
import java.util.Scanner;
 class math{
 int a;
 int b;
public math(int a,int b){
    this.a=a;
    this.b=b;
}
     public  int add(){
         return a+b;
     }
     public  int subtract(){
        if(a>b)
         return (a-b);
        return b-a;
     }
     public  int multiply(){
         return a*b;
     }
     public  int divide(){
         return a/b;
     }
}
 public class hello{
     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        math m=new math(s.nextInt(),s.nextInt());
        System.out.println(m.add());
        System.out.println(m.subtract());
        System.out.println(m.multiply());
        System.out.println(m.divide());
     }
     
     

}