import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        if (str == null || str.length() == 0) {
            return list;
        }
        fun(list, str.toCharArray(), 0);
        Collections.sort(list);
        return list;
    }

    private void fun(ArrayList<String> list, char[] str, int index) {
        if (index == str.length - 1) {
            list.add(new String(str));
            return;
        }
        for (int i = index; i < str.length; i++) {
            if (i == index || str[index] != str[i]) {
                swap(str, i, index);
                fun(list, str, index + 1);
                swap(str, i, index);
            }
        }
    }

    private void swap(char[] str, int i, int j) {
        char t = str[i];
        str[i] = str[j];
        str[j] = t;
    }
}