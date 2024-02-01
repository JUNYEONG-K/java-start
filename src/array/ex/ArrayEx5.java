package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int length = scanner.nextInt();
        int[] nums =  new int[length];

        System.out.println(length + "개의 정수를 입력하세요.");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        double average = (double) total / nums.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
