package chapter5programs;

public class bitwise_not {
    public static void main(String[] args) {
        int b=-34;
        for(int t=128;t>0;t=t/2){
            if((b&t)!=0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
        //reverse all bits
        b=(byte)~b;
        for(int i=128;i>0;i=i/2){
            if((b&i)!=0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
