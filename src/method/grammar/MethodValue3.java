package method.grammar;

public class MethodValue3 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. changeNumber 호출 전, num: " + num); // 5
        int changedNumber = changeNumber(num);
        System.out.println("4. changeNumber 호출 후, num: " + num); // 5

        System.out.println("num = " + num); // 5
        System.out.println("changedNumber = " + changedNumber); // 10

        num = changeNumber(num);
        System.out.println("num = " + num);
    }

    public static int changeNumber(int num) {
        System.out.println("2. changeNumber 변경 전, num: " + num); // 5
        num = num * 2;
        System.out.println("3. changeNumber 변경 후, num: " + num); // 10

        return num;
    }
}
