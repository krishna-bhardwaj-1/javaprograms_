package chapter3programs;

public class ifelseiifladder {
    public static void main(String[] args)
        throws java.io.IOException{
        int i;
        for(i=0;i<=5;i++){
            if(i==1) System.out.println("i is one");
            else if(i==2) System.out.println("i is two");
            else if(i==3) System.out.println("i is three");
            else if(i==4) System.out.println("i is four");
            else System.out.println("i is not between 1 and 4");
        }
    }
}
