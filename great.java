import java.util.Scanner;
  class great                                                            {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      if(a<0)
      {
        System.out.println("a is negative");
      }
      else if(a>0)
      {
        System.out.println("a is positive");
      }
      else
      {
        System.out.println("a is zero");
      }
    }
  
}
    
