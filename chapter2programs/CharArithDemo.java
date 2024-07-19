package chapter2programs;

public class CharArithDemo {
    public static void main(String[] args){
        char ch,b,c;
        ch='X';
        System.out.println("ch contains: "+ch);
        b=++ch;
        System.out.println("ch contains: "+b);
        c=++b;
        System.out.println("ch contains: "+c);
    }
}
