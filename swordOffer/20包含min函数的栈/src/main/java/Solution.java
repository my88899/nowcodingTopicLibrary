import java.util.Stack;

public class Solution {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    Integer tmp =null;
    public void push(int node) {
        data.push(node);
        if (min.isEmpty() || node <= min.peek()){
            min.push(node);
        }
    }

    public void pop() {
        if (data.peek() == min.peek()) {
            min.pop();
        }
        data.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}