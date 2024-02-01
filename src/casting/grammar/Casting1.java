package casting.grammar;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);

        doubleValue = longValue;
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue = " + doubleValue);
    }
}
