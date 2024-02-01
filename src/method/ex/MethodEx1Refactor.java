package method.ex;

public class MethodEx1Refactor {
    public static void main(String[] args) {
        int[] grades1 = {1, 2, 3};
        double average = getAverage(grades1);

        System.out.println("평균값: " + average);

        int[] grades2 = {15, 25, 35};
        average = getAverage(grades2);
        System.out.println("평균값: " + average);
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public static double getAverage(int total, int length) {
        return (double) total / length;
    }

    public static double getAverage(int[] nums) {
        int sum = sum(nums);
        return (double) sum / nums.length;
    }
}
