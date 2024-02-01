package casting.grammar;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1

        int intValue = (int) maxIntValue;
        System.out.println("intValue = " + intValue);

        int intValueOver = (int) maxIntOver; // overflow -> int 형 최소값부터 시작 (시계처럼 ㅎㅎ)
        System.out.println("intValueOver = " + intValueOver);
    }
}
