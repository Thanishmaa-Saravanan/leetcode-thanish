// Last updated: 12/08/2026, 11:45:20
import java.util.*;

class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE); // sentinel
        int result = 0;

        for (int num : arr) {
            while (stack.peek() <= num) {
                int mid = stack.pop();
                result += mid * Math.min(stack.peek(), num);
            }
            stack.push(num);
        }

        while (stack.size() > 2) {
            result += stack.pop() * stack.peek();
        }

        return result;
    }
}
