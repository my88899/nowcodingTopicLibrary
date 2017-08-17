public class Solution {
    public boolean Find(int target, int [][] array) {
        int col = array.length - 1;
        int row = 0;
        int rowLength = array[0].length;
        while (col>=0 && row<rowLength) {
            if (target < array[col][row]) {
                col--;
            }else if (target > array[col][row]) {
                row++;
            }else if (array[col][row] == target)
                return true;
        }
        return false;
    }
}
