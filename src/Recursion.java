import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Hello Universe");
        String[][] result = nQueensMain(5);
        System.out.println(Arrays.toString(result));
        for (String[] resElement : result){
            System.out.println(Arrays.toString(resElement));
        }
        //System.out.println(Arrays.toString(result[0]));
        //System.out.println(Arrays.toString(result[1]));
    }

    public static String[][] nQueensMain(int n) {
        List<String[]> result = new ArrayList<>();
        int[] arr = new int[n];
        Arrays.fill(arr, Integer.MIN_VALUE);
        nQueens(arr, 0, result);
        return result.toArray(new String[0][0]);
    }


    static void nQueens(int[] arr, int rowIdx, List<String[]> result) {
        // bcase
        if (rowIdx >= arr.length) {
            result.add(getString(arr));
            return;
        }
        // rcase
        for (int col = 0; col < arr.length; col++) {
            if (isSafe(arr, rowIdx, col)) {
                arr[rowIdx] = col;
                Recursion.nQueens(arr, rowIdx + 1, result);
                // remove the placement
                arr[rowIdx] = Integer.MIN_VALUE;
            }
        }
    }

    static boolean isSafe(int[] arr, int rowIdx, int colIdx) {
        if(arr[rowIdx] != Integer.MIN_VALUE) {
            return false;
        }
        // check if column is already having any queen.
        for (int row = 0; row < arr.length; row++) {
            if (arr[row] == colIdx) {
                return false;
            }
            int rowDiff = Math.abs(rowIdx - row);
            int colDiff = Math.abs(colIdx - arr[row]);
            if (rowDiff == colDiff) {
                return false;
            }
        }
        return true;
    }

    static String[] getString(int[] arr) {
        String[] strArr = new String[arr.length];
        // go to every row and then every column and create a string.
        for (int row = 0; row < arr.length; row++) {
            StringBuilder sb = new StringBuilder();
            int queenCol = arr[row];
            for (int col = 0; col < arr.length; col++) {
                if (col == queenCol) {
                    sb.append("q");
                } else {
                    sb.append("-");
                }
            }
            strArr[row] = sb.toString();
        }
        return strArr;
    }


}
