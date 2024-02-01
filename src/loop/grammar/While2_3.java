package loop.grammar;

public class While2_3 {
    public static void main(String[] args) {
        int i = 1;
        int endNum = 10;
        int sum = 0;

        while (i <= endNum) {
            sum = sum + i;
            i++;
        }

        System.out.println("sum = " + sum);
    }
}
