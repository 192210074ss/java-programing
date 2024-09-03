import java.util.Scanner;
public class String{
public static void main(String[]args){
Scanner sc=new Scanner(system.in);
system.out.print("enter a string");
String input=sc.nextLine();
String reverse=reverse(input);
system.out.print("reverse string"+reverse);
system.close();
}
public static String reverse(String str){
Stringbuilder reverse=new Stringbuilder();
for (int i=str.length()-1;i>=0;--i){
reverse.append(chartAt(i));
}
return reverse.tostring(); 
}
}