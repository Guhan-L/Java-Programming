public class strings{
  public static void main(String args[]){
    String s1="Hello";
    System.out.println("String 1:"+s1);
    String s2="hello";
    System.out.println("String 2:"+s2);
    System.out.println("s1.equals(s2):"+s1.equals(s2));
    System.out.println("s1.equalsIgnoreCase(s2):"+s1.equalsIgnoreCase(s2));
    System.out.println("s1.startsWith('a'):"+s1.startsWith("a"));
    System.out.println("s2.endsWith('lo'):"+s2.endsWith("lo"));
    System.out.println("s2.indexOf('h'):"+s2.indexOf('h')); 
    System.out.println("s2.lastIndexOf(i):"+s2.lastIndexOf("i"));
    String s4="Java!";
    System.out.println("s1.concat(s4):"+s1.concat(s4));
    System.out.println("s1.replace('l','i'):"+s1.replace('l','i'));
    String s3="   Hi!     ";
    System.out.println("s3.trim():"+s3.trim());
    System.out.println("s2.toLowerCase():"+s2.toLowerCase());
    System.out.println("s2.toUpperCase():"+s2.toUpperCase());
      
    
    
    
    
    
  }}