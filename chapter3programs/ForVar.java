package chapter3programs;

public class ForVar {
    public static void main(String[] args){
        int sum=0,fact=1;
        for(int i=1;i<=5;i++){
            sum+=i;
            fact*=i;
        }
        System.out.println("sum is: "+sum);
        System.out.println("Factorial is: "+fact);
    }
}
