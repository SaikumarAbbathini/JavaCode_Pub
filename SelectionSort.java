package JavaCode;

import java.util.Arrays;

public class SelectionSort {
    
    static int[] selectionSort(int[] arr){

        for(int i=0; i<arr.length-1;i++){
            int s = i;

            for(int j=i+1; j<arr.length;j++) if(arr[j]<arr[s]) s=j;

            int tmp = arr[i];
            arr[i] = arr[s];
            arr[s] = tmp;

        }
        return arr;
    }
   
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,1,2,9,11,19,17};   
        arr=selectionSort(arr);
        // //Printing Elements
        System.out.println(Arrays.toString(arr));
    }
}
