package method.ex;

public class MethodEx2Refactor {
    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessageIterator(message, 3);

        printMessageIterator(message, 5);

        printMessageIterator(message, 7);
    }

    public static void printMessageIterator(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
