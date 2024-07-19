package chapter5programs;

public class stringdemo {
    public static void main(String[] args) {
        String st = new String("Java strings are objects.");
        String st2 ="They are constructed various ways.";
        String st3 = new String(st2);
        if(st.equals(st2)) System.out.println("Yes");else System.out.println("No");
        System.out.println(st);
        System.out.println(st2);
        System.out.print(st3);
    }
}
