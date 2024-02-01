package condition.ex;

public class ConditionEx7 {
    public static void main(String[] args) {
        int x = 52;
        String result = x % 2 == 0 ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + result);
    }
}
