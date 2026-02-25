class TryCatchDemo{
  public static void main(String[] args){
    try{
      int a=19;
      int b=0;
      int c=a/b;
      System.out.println("C="+c);
      int arr[]=new int[5];
      arr[10]=50;
    }
    catch (ArithmeticException e){
      System.out.println("Arithmetic Error");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array Index Error");
    }
    finally{
      System.out.println("Finally Block Executed");
    }
  }}