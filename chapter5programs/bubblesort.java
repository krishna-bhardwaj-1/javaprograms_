package chapter5programs;

public class bubblesort {
    public static void main(String[] args) {
        int[] nums={99,-10,100123,18,-978,5623,463,-9,287,49};
        int size=10;
        int a,b,c;
        System.out.print("Original array is:");
        for(int i=0;i<size;i++)
            System.out.print(" "+nums[i]);
        System.out.println();
        for(a=1;a<size;a++){
            for(b=size-1;b>=a;b--){
                if(nums[b-1]>nums[b]) {
                    c = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = c;
                }
            }
        }
        System.out.print("Array after sorting:");
        for(int i=1;i<size;i++){
            System.out.print(" "+nums[i]);
        }
    }
}
