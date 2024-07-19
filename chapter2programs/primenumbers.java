package chapter2programs;

public class primenumbers {
    public static void main(String[] args) {
        int a,i;
        for(a=2;a<=100;a++){
            int c=0;
            for(i=2;i<=(a/i);i++){
                if(a%i==0){
                    c++;
                }
            }
            if(c==0){
                System.out.println(a);
            }
        }
    }
}
