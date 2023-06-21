import java.util.Arrays;

public class QuickSort {
   public static void main(String[] args) {
    int[] arr = {7,8,3,5,10,2,8};
      quickSort(arr, 0, arr.length-1);

      System.out.println(Arrays.toString(arr));
   }
   
   public static void quickSort(int[] arr , int lo , int hi){

    if(lo>=hi){
        return;
    }

    int s=lo;
    int e=hi;
    int mid = s + (e-s)/2;

    while(s<=e){
        while(arr[s]<arr[mid]){
            s++;
        }

        while(arr[e]>arr[mid]){
            e--;
        }

        if(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    quickSort(arr, lo, e);
    quickSort(arr, s, hi);


   }
}
