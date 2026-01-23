
import java.util.Scanner;

 public class pelindronnum{

 public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("enter the value of x");
int x = sc.nextInt();

int reverse = 0;
int num = x;

if(num <0){
System.out.println("number is not pelindrom");

}


while(return !=0){

int digit = num%10;
int reverse = reverse*10 +digit;
num =  num/10;

}

if(reverse == num){
System.out.println("number is pelindrom");

}





}

}
