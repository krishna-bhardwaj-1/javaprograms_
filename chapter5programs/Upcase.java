package chapter5programs;

import java.sql.SQLOutput;

public class Upcase {
    public static void main(String[] args) {
//        int a=97;
//        int b=65;
//        String st = Integer.toBinaryString(a);
//        String str = String.valueOf(a);
//        String str2 = Integer.toBinaryString(b);
//        System.out.println(str);
//        System.out.println(st);
//        System.out.println(str2);
        char ch;
        for (int i=0;i<26;i++){
            ch=(char)('a'+i);
            System.out.print(ch);
            ch=(char)((int)ch&65503);
            System.out.println(ch);
        }
        System.out.println();
    }
}
class Lowcase{
    public static void main(String[] args) {
        char ch;
        for(int i=0;i<26;i++){
            ch=(char)('A'+i);
            System.out.print(ch);
            ch=(char)((int)ch|32);
            System.out.println(ch);
        }
    }
}
