package array.grammar;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[4][2];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int j = 0; j < arr[row].length; j++) {
                System.out.print(arr[row][j] + " ");
            }
            System.out.println();
        }
    }
}
