public class Solution {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.trim().equals("")) {
            return str;
        }
        String[] tmp = str.split(" ");
        StringBuffer result = new StringBuffer();
        for (int i = tmp.length - 1; i > 0; i--) {
            result.append(tmp[i]+" ");
        }
        result.append(tmp[0]);
        return result.toString();
    }
}