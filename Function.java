public class Function {
    int a = 3;
    int b = 7;

    public int add() {
        return a + b;
    }

    public static void main(String[] args) {
      Function obj = new Function();

        System.out.println(obj.add());
    }
}
