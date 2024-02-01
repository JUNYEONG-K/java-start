package method.grammar;

public class MethodValue2 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. changeNumber 호출 전, num: " + num); // 5
        changeNumber(num);
        System.out.println("4. changeNumber 호출 후, num: " + num); // 5

    }

    public static void changeNumber(int num) {
        System.out.println("2. changeNumber 변경 전, num: " + num); // 5
        num = num * 2;
        System.out.println("3. changeNumber 변경 후, num: " + num); // 10
    }
}
