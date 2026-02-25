import java.util.Scanner;
class area1{
  int area(int s){
    return s*s;
  }
  int area(int l,int b){
    return l*b;
  }

  public static void main(String args[]){
    area1 a=new area1();
    System.out.println("Area of Square:"+a.area(5));
    System.out.println("Area of Rectangle:"+a.area(5,4));  
  }
}
    
    