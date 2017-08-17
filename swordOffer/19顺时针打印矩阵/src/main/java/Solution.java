import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
//    public int[] printMatrix(int [][] matrix) {
//        int[] tp = {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10};
//        int[] side = new int[matrix.length * matrix[0].length];
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 0 || col == 0) {
            return list;
//            return  side;
        }
        int left = 0, right = col - 1, top = 0, low = row - 1;
//        return list;
        int d = 0;
        while (left <= right && top <= low) {
            for (int i = left; i <= right; i++) {
//                side[d++] = matrix[top][i];
                list.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= low; i++) {
//                side[d++] = matrix[i][right];
                list.add(matrix[i][right]);
            }
            for (int i = right - 1; i >= left && top < low ; i--) {
//                side[d++] = matrix[low][i];
                list.add(matrix[low][i]);
            }
            for (int i = low - 1; i > top && right > left; i--) {
//                side[d++] = matrix[i][left];
                list.add(matrix[i][left]);
            }
            left++;right--;top++;low--;
        }
//        return side;
        return list;
    }
}