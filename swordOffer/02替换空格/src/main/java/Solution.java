public class Solution {
    public String replaceSpace(StringBuffer str) {
//        String strl = new String("We%20Are%20Happy");
        return str.toString().replaceAll(" ", "%20");
    }
}
