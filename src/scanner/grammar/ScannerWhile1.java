package scanner.grammar;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("문자열을 읿력하세요(exit: 종료): ");
            String string = scanner.nextLine();

            if (string.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }

            System.out.println("string = " + string);
        }
    }
}
