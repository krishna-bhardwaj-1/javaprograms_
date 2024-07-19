package chapter3programs;

public class help {
    public static void main(String[] args)
            throws java.io.IOException{
        char choice;
        System.out.println("Help on:\n\t1. if\n\t2. switch\nChoose one:");
        choice=(char)System.in.read();
        switch(choice){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The traditional switch:\n");
                break;
            default:
                System.out.println("selection not found.");
        }
    }
}
