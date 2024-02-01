package casting.grammar;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;

//        int intValue = doubleValue; // 컴파일 오류 발생
        int intValue = (int) doubleValue; // 명시적 형변환 (type casting)

        System.out.println("doubleValue = " + doubleValue);
        System.out.println("intValue = " + intValue);

        System.out.println((int) 10.5);
    }
}
