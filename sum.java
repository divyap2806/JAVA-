
import java.util.Scanner;

class sum{
  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);

  System.out.println("enter the target");
  int target = sc.nextInt(); 
  

  System.out.println("enter the array size");
  int n = sc.nextInt();

  int[] num = new int[n];
  System.out.println("enter the array ");
  for(int i =0 ;i<n;i++){
   num[i] = sc.nextInt();
}

System.out.println(" the array ");
  for( int i =0 ;i<n;i++){
   System.out.println(num[i] );
}

 
for(int i = 0; i < n; i++){
    for(int j = i + 1; j < n; j++){
        if(num[i] + num[j] == target){
            System.out.println("Indices: " + i + " " + j);
            return;
        }
    }
}

sc.close();





}

}