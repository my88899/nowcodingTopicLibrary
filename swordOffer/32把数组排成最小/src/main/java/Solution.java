import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length ==0) {
            return "";
        }
        String[] list = new String[numbers.length];
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < numbers.length; i++) {
            list[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });
        for (int i = 0; i < numbers.length; i++) {
            result.append(list[i]);
        }
        return result.toString();
    }
}