package array.grammar;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for 문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number = " + number);
        }

        System.out.println();

        // 향상된 for 문, for-each
        for (int number : numbers) {
            System.out.println("number = " + number);
        }

        System.out.println();

        // for-each 사용할 수 없는 경우 -> index 값 필요할 때
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number " + i + "의 결과는 " + numbers[i]);
        }
    }
}
