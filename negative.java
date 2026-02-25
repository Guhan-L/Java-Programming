import java.util.Scanner;
class negative{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    while(n!=0){
      if(n<0){
        break;
      }
      else{
        System.out.println("Enter a number:");
         n=sc.nextInt();
      }
    }
    
  }
}
    