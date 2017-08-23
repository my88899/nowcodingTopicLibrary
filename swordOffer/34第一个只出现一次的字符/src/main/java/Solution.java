import java.util.Arrays;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        char[] list = str.toCharArray();
        int[] ori = new int['z' - 'A' + 1];
        for (char d : list) {
            ori[(int) (d - 'A')]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (ori[(int) (list[i] - 'A')] == 1) {
                return i;
            }
        }
        return -1;
    }
}