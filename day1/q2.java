import java.util.*;
import java.util.Scanner;
 class Math{
static int a;
static int b;
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
        conditionalOperation(a,b);
     }
     public static void conditionalOperation(int a,int b){
         if(a<b){
             System.out.println(a+b);
         }
         else if(a>b && b!=0){
             System.out.println(a/b);
         }
         else if(a>b){
             System.out.println(a-b);
         }
         else if(a==b){
             System.out.println(a*b);
         }
     }
}


//using case
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
        conditionalOperation(a,b);
     }
     public static void conditionalOperation(int a,int b){
         int level=0;
         if(a<b){
             level=1;
         }
         else if(a>b && b!=0){
             level=2;
         }
         else if(a>b){
             level=3;
         }
         else if(a==b){
             level=4;
         }
         switch(level){
         case 1:
            System.out.println(a+b);
            break;
         case 2 :
            System.out.println(a/b);
            break;
         case 3:
            System.out.println(a-b);
            break;
        case 4: 
            System.out.println(a*b);   
        
     }
}
}
