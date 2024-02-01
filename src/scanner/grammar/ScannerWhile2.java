package scanner.grammar;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번쨰 숫자와 두 번째 숫자 모두 0을 입력하면 종료합니다.");

        while(true) {
            System.out.print("첫 번쨰 숫자: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번쨰 숫자: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("종료합니다.");
                break;
            }

            System.out.println("합: " + (num1 + num2));
        }
    }
}
