package chapter5programs;

public class foreach {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i:nums){
            sum+=i;
            System.out.println(i);}
        System.out.println("sum of the given array is: "+sum);
    }
}
