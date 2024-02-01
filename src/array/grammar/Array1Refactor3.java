package array.grammar;

public class Array1Refactor3 {
    public static void main(String[] args) {
        int[] students;
        students = new int[]{90, 80, 70, 60, 50}; // 배열 생성 및 초기화 -> 크기는 지정하지 않음.

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
