package JavaCode;

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionSort(int[] arr){

        for(int i=1; i<arr.length;i++){
            int c=arr[i];
            int j=i-1;
            
            while (j>=0 && c<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            //Placment(used j+1 because j-- in above step)
            arr[j+1]=c;

        }


        return arr;
    }
    public static void main(String[] args) {
        
        int[] arr={7,8,3,1,2};
        
        InsertionSort is = new InsertionSort();

        System.out.println(Arrays.toString(is.insertionSort(arr)));
        

    }
}
