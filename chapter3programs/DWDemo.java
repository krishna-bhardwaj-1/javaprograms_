package chapter3programs;

public class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException{
        char ch,ignore;
        do{
            System.out.println("Press a key followed by enter: ");
            ch=(char)System.in.read();
            do{
                ignore=(char)System.in.read();
            }while (ignore!='\n');
            if(ch=='q') System.out.println("**Right**");
        }while (ch!='q');
    }
}
