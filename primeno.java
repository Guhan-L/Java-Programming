import java.util.Scanner;
class primeno{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n:");
    int n=sc.nextInt();
    int i=1;
    while(i<=n){
      if (n%i==0){
        System.out.println("Its Prime number");
      }
      else{
        System.out.println("Its not a Prime number");
      }
    }
  }
}
      
      