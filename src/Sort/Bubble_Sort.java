package Sort;

import java.util.Arrays;
public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            System.out.println(Arrays.toString(arr));
            for (int j = 0; j < n-i-1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
