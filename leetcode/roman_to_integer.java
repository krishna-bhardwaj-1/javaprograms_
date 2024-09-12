package leetcode;

import java.util.Scanner;

public class roman_to_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        int s=0;
        for(int i=0;i<p.length();i++){
            if(p.substring(i,i+1)=="I"){
                s+=1;
            }
            else if(p.substring(i,i+1)=="V"){
                s+=5;
            }
        }
        System.out.println(s);
    }
}
