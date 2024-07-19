package chapter3programs;

public class ifelse {
    public static void main(String[] args)
        throws java.io.IOException{
        char ch,ans='k';
        System.out.println("I'm thinking of a letter between A and Z\nCan u guess it");
        ch=(char)System.in.read();
        if(ch==ans) System.out.println("**Right**");
        else{
            System.out.print("....Sorry, You are ");
            if(ch<ans) System.out.println("too low");
            else System.out.println("too high");
        }
    }
}
