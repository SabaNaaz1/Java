import java.util.*;

public class set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        int[] arr = {10, 20, 30, 20, 10, 40};
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
            
        }
        Arrays.sort(arr);
        System.out.println(set);
    }
}


