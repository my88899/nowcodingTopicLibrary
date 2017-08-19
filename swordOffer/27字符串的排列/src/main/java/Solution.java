import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
//        ArrayList<String> list = new ArrayList<String>(){{add("abc");add("acb");add("bac");add("bca");add("cab");add("cba");}};
        ArrayList<String> list = new ArrayList<>();
        ArrayList<> listChar = str.toCharArray();
        Collections.sort(listChar);
        for (char c:listChar
             ) {
            list.add(c);
        }
        return list;
    }
}