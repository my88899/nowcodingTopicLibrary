import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;
        }
        int min = array[0];
        for (int i = 1; i < array.length-1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}