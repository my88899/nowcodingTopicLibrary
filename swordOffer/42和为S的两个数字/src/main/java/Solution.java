import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
//        ArrayList<Integer> list = new ArrayList<Integer>(){{add(1);add(9);}};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int low = 1, high = array.length - 1, mid = (low + high) >> 1;
        for (int i = 0; i < array.length; i++) {
            int tmp = sum - array[i];
            low = i + 1;
            while (high >= low){
                mid = (high + low) >> 1;
                if (array[mid] < tmp) {
                    low = mid + 1;
                } else if (array[mid] > tmp) {
                    high = mid - 1;
                } else if (array[mid] == tmp){
                    list.add(array[i]);
                    list.add(array[mid]);
                    break;
                }
            }
            if (array[mid] == tmp || i >= high) {
                break;
            }
        }
        return list;
    }
}