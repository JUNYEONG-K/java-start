package operator.grammar;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // a = a + 3; => 8
        a -= 2; // a = a - 2; => 6
        a *= 4; // a = a * 4; => 24
        a /= 3; // a = a / 3; => 8
        a %= 5; // a = a % 5; => 3
        System.out.println("a = " + a);
    }
}