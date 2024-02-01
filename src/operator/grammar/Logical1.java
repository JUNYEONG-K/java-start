package operator.grammar;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산"); // false 가 하나라도 있다면 false
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산"); // true 가 하나라도 있다면 true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("!: NOT 연산"); // 부정, 반대
        System.out.println(!true);
        System.out.println(!false);
    }
}
