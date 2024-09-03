import java.io.*;
import java.lang.*;
class C implements Cloneable{
int a;
double b;
public static void main(String[] args) throws CloneNotSupportedException{
C obj=new C();
obj.a=10;
obj.b=6.9;
System.out.println(obj.a+" "+obj.b);
C obj1=(C)obj.clone();
System.out.println(obj1.a+" "+obj1.b);
}
}