class Mythread extends Thread{
  public void run(){
    System.out.println("Thread is Running");
  }
  public static void main(String args[]){
    Mythread t=new Mythread();
    t.start();
  }
}
