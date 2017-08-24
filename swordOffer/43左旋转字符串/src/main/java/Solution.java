public class Solution {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0) {
            return "";
        }
        n %= str.length();
        StringBuffer strAfterShift = new StringBuffer();
//        char[] tmp = str.toCharArray();
//        for (int i = n; i < str.length(); i++) {
//            strAfterShift.append(tmp[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            strAfterShift.append(tmp[i]);
//        }
        strAfterShift.append(str.substring(n, str.length()));
        strAfterShift.append(str.substring(0, n));
        return strAfterShift.toString();
    }
}