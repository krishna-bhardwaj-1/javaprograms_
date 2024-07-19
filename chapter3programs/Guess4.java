package chapter3programs;

public class Guess4 {
    public static void main(String[] args)
        throws java.io.IOException{
        char ch,ignore,answer='k';
        do{
            System.out.print("I\'m thinking of a letter between A and Z\nCan you guess it: ");
            ch=(char)System.in.read();
            do{
                ignore=(char)System.in.read();
            }while (ignore!='\n');
            if(ch==answer) System.out.println("**Right**");
            else{
                System.out.print("...Sorry you\'re ");
                if(ch<answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        }while(answer!=ch);
    }
}
