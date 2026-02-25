public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("String:"+"Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        sb.replace(6, 11, "C++ ");
        System.out.println("After replace: " + sb);
        sb.delete(6, 10);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
    