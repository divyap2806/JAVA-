import java.util.Scanner;

public class Swappingtwonumber
{
  public static void main(String []args)
{
   Scanner sc = new Scanner(System.in);
   double temp;

   System.out.println("enter value of a");
   double a = sc.nextDouble();
   
 System.out.println("enter value of b");
   double b = sc.nextDouble();
   
 System.out.println("a" +a);
System.out.println("b" +b);

temp=a;
a=b;
b=temp;
System.out.println("the value of a and b is: " +a +b);






}
}