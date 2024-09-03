import java.util.Scanner;
public class sumofnatural{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter value of n");
int n=sc.nextInt();
int sum=0;
int i=1;
do{
sum+=i;
i++;
}while(i<=n);
System.out.println("natural number"+n+" "+sum);

}
}

