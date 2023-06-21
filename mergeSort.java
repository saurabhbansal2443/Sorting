import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 2, 1, 0, 6, 4 };

        int[] res = mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(res));
    }

    public static int[] mergeSort(int[] arr, int st, int end) {

        if (st == end) {
            int[] base = new int[1];

            base[0] = arr[st];

            return base;
        }

        int mid = (st + end) / 2;

        int[] fsa = mergeSort(arr, st, mid);
        int[] ssa = mergeSort(arr, mid + 1, end);

        int[] res = mergeTwoSortedArray(fsa, ssa);

        return res;

    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 != arr1.length && p2 != arr2.length) {

            if (arr1[p1] > arr2[p2]) {
                res[p3] = arr2[p2];
                p3++;
                p2++;

            } else {

                res[p3] = arr1[p1];
                p3++;
                p1++;
            }

        }

        if (p1 == arr1.length) {
            for (int i = p3; i < res.length; i++) {
                res[i] = arr2[p2];
                p2++;
            }
        } else {
            for (int i = p3; i < res.length; i++) {
                res[i] = arr1[p1];
                p1++;
            }

        }

        return res;

    }
}
