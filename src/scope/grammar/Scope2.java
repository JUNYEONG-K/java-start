package scope.grammar;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { // i 생존 시작
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        } // i 사망

        System.out.println("main m = " + m);
//        System.out.println("main i = " + i);
    } // m 사망
}
