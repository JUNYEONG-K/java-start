package loop.grammar;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5) {
            if (i == 3) {
                i++;
                continue;
            } // while 조건식으로 직행
            System.out.println("i = " + i);
            i++;
        }
    }
}
