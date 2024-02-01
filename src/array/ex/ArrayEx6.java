package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] nums = new int[count];
        System.out.println("3개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        int max = nums[0], min = nums[0];
        for (int num : nums) {
            if (max < num) max = num;
            if (min > num) min = num;
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
