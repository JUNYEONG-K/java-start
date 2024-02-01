package method.ex;

import java.util.Scanner;

public class MethodEx4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("----------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("----------------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                balance = deposit(balance, amount);
            }

            if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                balance = withdraw(balance, amount);
            }

            if (choice == 3) {
                System.out.println("현재 잔액: " + balance);
            }

            if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
}
