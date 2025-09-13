package Java;
public class Recursion {

    static int Print(int n){
        if (n < 1) {
            return 0;
        }
        System.out.println(n);
        return Print(n - 1);
    }
    public static void main(String[] args) {
        Print(5);
    }
}
