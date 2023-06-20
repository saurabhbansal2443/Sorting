import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {7,4,1,0,2,3,5};

        for(int i=1;i<arr.length;i++){

            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else{
                    break ;
                }
            }

           
        }
        System.out.println(Arrays.toString(arr));
    }
}
