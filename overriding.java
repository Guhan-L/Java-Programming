class animal{
  void sound(){
    System.out.println("Animal makes sound");
  }
}
  class dog extends animal{
    void sound(){
      System.out.println("Dog Barks");
    }
  }

public class overriding{
  public static void main(String args[]){
    animal a=new animal();
    a.sound();
    dog b=new dog();
    b.sound();
  }}
  