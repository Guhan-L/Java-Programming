import java.util.Scanner;
class reverse{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n:");
    int n=sc.nextInt();
    int rev=0;
    int num=n;
    System.out.println("Given number:"+n);
    while(n!=0){
      int d=n%10;
      rev=rev*10+d;
      n=n/10;      
    }
    
    System.out.println("Reversed number:"+rev);
    if(num==rev){
      System.out.println("It's a Palindrome..");
    }
    else{
      System.out.println("It's not a Palindrome..");
    }
      
  }
  }
