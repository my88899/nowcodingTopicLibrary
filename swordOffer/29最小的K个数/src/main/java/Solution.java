import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        ArrayList<Integer> list = new ArrayList<Integer>(){{add(1);add(2);add(3);add(4);}};
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length || k == 0) {
            return list;
        }
        PriorityQueue<Integer> Kmin = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (i < k) {
                Kmin.offer(input[i]);
            }else if (Kmin.peek() > input[i]) {
                Integer tmp = Kmin.remove();
                tmp = null;
                Kmin.offer(input[i]);
            }
        }
//        for (Integer tmp:Kmin) {
//            list.add(tmp);
//        }
        while (!Kmin.isEmpty()){
            list.add(Kmin.poll());
        }
        return list;
    }
}