package chapter3programs;

public class Fortest {
    public static void main(String[] args)
        throws java.io.IOException{
        int i;
        for(i=0;(char)System.in.read()!='S';i++)
            System.out.println("Pass # "+i);
    }
}
