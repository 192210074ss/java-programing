import java.io.*;
interface Printable {
int a=10;
void print();
}
interface showable extends Printable {
String name="Sohail";
void show();
}
class B implements showable
{
public void print(){
System.out.println(a); 
}
public void show(){
System.out.println(name);
}
public static void main(String arg[])
{

B obj = new B();
obj.print();
obj.show();
}
}