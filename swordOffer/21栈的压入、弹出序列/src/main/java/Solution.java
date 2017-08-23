import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> tmp = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            tmp.push(pushA[i]);
            while (!tmp.isEmpty() && tmp.peek() == popA[j]) {
                j++;
                tmp.pop();
            }
        }
        return j == popA.length ? true : false;
    }
}