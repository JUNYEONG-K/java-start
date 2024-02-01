package method.grammar;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = isOdd(3);
        System.out.println("result = " + result);
    }

    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }
}
