package operator.grammar;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); // 1

        a = a + 1;
        System.out.println("a = " + a); // 2

        ++a; // 전위(Prefix) 연산자
        System.out.println("a = " + a); // 3
        ++a;
        System.out.println("a = " + a); // 4

        a++; // 후위(PostFix) 연산자
        System.out.println("a = " + a); // 5

        System.out.println(a++); // 5
        System.out.println(a); // 6
        System.out.println(++a); // 7
    }
}
