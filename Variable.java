import java.util.Scanner;

public class Variable{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

//byte
System.out.println("enter byte value : ");
byte b = sc.nextByte();


//short
System.out.println("enter short value : ");
short s = sc.nextShort();

//long
System.out.println("enter long value : ");
long l =sc.nextLong();

//int
System.out.println("enter int value : ");
int i = sc.nextInt();

//double
System.out.println("enter double value : ");
double d = sc.nextDouble();

//float
System.out.println("enter float value : ");
float f = sc.nextFloat();

//char
System.out.println("enter char value : ");
char c = sc.next().charAt(0);

//boolean
System.out.println("entervboolean value : ");
boolean bool = sc.nextBoolean();

//string
System.out.println("enter string value : ");
String str = sc.next();


System.out.println(" value : " + b);
System.out.println(" value : " +s);
System.out.println(" value : " +l);
System.out.println(" value : " +i);
System.out.println(" value : " +d);
System.out.println(" value : "+c);
System.out.println(" value : "+bool);
System.out.println(" value : " +f);











sc.close();

    }
}