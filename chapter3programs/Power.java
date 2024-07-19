package chapter3programs;

public class Power {
    public static void main(String[] args){
        int e,r;
        for(int i=0;i<10;i++){
            r=1;e=i;
            while(e>0){
                r*=2;
                e--;
            }
            System.out.println("2 to the "+i+" power is "+r);
        }
    }
}
