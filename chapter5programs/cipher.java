package chapter5programs;

import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {
        System.out.println("Enter your megical no.: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a^b;
        //System.out.println(c);
        System.out.println(c^b);
    }
}
