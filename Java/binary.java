package Java;
public class BinarySearch{
    static int Binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (target < arr[mid]) {
                return end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 9 };
        int target = 6;
        System.out.println(Binary(arr, target));
    }
}
