import java.util.Scanner;
class area{
  int square(int s){
    return s*s;
  }
  int rectangle(int l,int b){
    return l*b;
  }
}
public class overloading{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int l=sc.nextInt();
    int b=sc.nextInt();
    area a=new area();
  }
}
    
    