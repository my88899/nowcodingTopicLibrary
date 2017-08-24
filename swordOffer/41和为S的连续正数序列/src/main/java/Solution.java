import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        if (sum < 3) {
            return lists;
        }
        int numMin = 2, numMax = (int) Math.floor(Math.sqrt(2 * sum + 0.25) - 0.5) ;
        for (int n = numMax; n >= numMin; n--) {
            int listMin = ((2 * sum) / n + 1 - n) / 2;
            if ((2 * listMin + n - 1) * n / 2 == sum) {
                ArrayList<Integer> tmpList = new ArrayList<Integer>();
                for (int i = 0; i < n; i++) {
                    tmpList.add(listMin + i);
                }
                lists.add(tmpList);
            }
        }
        return lists;
    }
}