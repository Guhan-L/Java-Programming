import java.util.Scanner;
class table{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n:");
    int n=sc.nextInt();
    System.out.println("Multiplication Table of "+ n);
    for(int i=0;i<=10;i+=1){
      System.out.println(i+"*"+n+"="+i*n);
    }
  }
}