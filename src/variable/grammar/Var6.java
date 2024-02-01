package variable.grammar;

public class Var6 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127 (1 byte -> 8 bits -> -2^7 ~ 2^7 - 1)
        short s = 32767; // -32,768 ~ 32,767 (2 bytes -> 16 bits -> -2^15 ~ 2^15 - 1)
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 21억) (4 bytes) => 기본
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8 bytes)

        // 실수
        float f = 10.0F; // 4 bytes, 7자리 정밀도, 범위가 더 큼 (-3.4E38 ~ 3.4E38)
        double d = 10.0; // 8 bytes, 15자리 정밀도, 범위는 더 작음  (-1.7E308 ~ 1.7E308) => 기본
    }
}
