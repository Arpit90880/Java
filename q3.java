//3rd
import java.util.*;
public class Math1{
private int a;
private int b;
public String get() {
    return a+" "+b;
  }
 public void set(int a1,int b1) {
    this.a = a1;
    this.b = b1;
  }
     public static void main(String []args){
        Math1 m=new Math1();
        m.set(10,20);
        System.out.println(m.get());
     }
}
