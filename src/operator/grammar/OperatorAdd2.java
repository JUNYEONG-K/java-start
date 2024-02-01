package operator.grammar;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\n");

        a = 1;
        b = 0;

        b = a++; // a의 값을 대입하고, a 증가시킴
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\n");

        for (int i = 0; i < 5; ++i) {
            System.out.println("i = " + i);
        }
    }
}
