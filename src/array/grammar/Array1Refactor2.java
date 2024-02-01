package array.grammar;

public class Array1Refactor2 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5]; // 연속된 메모리 공간에 int 형 5개 사이즈 할당 -> 고정된 크기

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
