import java.util.Scanner;
class armstrong{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n:");
    int n=sc.nextInt();
    int num=n;
    int sum=0;
    while(n!=0){
      int d=n%10;
      sum=sum+(d*d*d);
      n=n/10;
    }
    if(num==sum){
      System.out.println("It's an Armstrong Number");
    }
    else{
      System.out.println("It's not an Armstrong Number");
    }
  }
}
      