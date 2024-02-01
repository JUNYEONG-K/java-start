package operator.grammar;

public class Operator2 {

    public static void main(String[] args) {
        String result1 = "hello " + "world";
        System.out.println("result1 = " + result1);

        String result2 = "a + b = " + 10; // java 가 10을 "10"으로 바꿔버림.
        System.out.println(result2);
    }
}
