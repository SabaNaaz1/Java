package Java;
import java.util.Arrays;

public class BubbleSort {
    static void bubblesort(int[] arr) {
        boolean sorted;
        for (int i = 0; i < arr.length - 1; i++) {
            sorted = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
