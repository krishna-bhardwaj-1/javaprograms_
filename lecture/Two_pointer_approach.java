package lecture;

import java.util.Arrays;

public class Two_pointer_approach {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
//        int i=0;
//        int j=arr.length-1;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
