import java.util.Arrays;

/***
 * <h1>Minimum Stack</h1>
 * <p>
 * Design a stack class that supports the push, pop, top, and getMin operations.
 * <p>
 * MinStack() initializes the stack object.
 * <p>
 * Void push(int val) pushes the element val onto the stack.
 * <p>
 * Void pop() removes the element on the top of the stack.
 * <p>
 * Int top() gets the top element of the stack.
 * <p>
 * Int getMin() retrieves the minimum element in the stack.
 * <p>
 * Each function should run in 𝑂(1) time.
 * <p>
 * Example 1:
 * <p>
 * Input: ["MinStack", "push", 1, "push", 2, "push", 0, "getMin", "pop", "top", "getMin"]
 * <p>
 * Output: [null,null,null,null,0,null,2,1]
 * <p>
 * Explanation:
 * <p>
 * MinStack minStack = new MinStack();
 * <p>
 * minStack.push(1);
 * <p>
 * minStack.push(2);
 * <p>
 * minStack.push(0);
 * <p>
 * minStack.getMin(); // return 0
 * <p>
 * minStack.pop();
 * <p>
 * minStack.top(); // return 2
 * <p>
 * minStack.getMin(); // return 1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -2^31 <= val <= 2^31-1.
 * <p>
 * Pop, top and getMin will always be called on non-empty stacks.
 */
public class MinimumStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);
        System.out.println(minStack.getMin()); // return 0
        minStack.pop();
        System.out.println(minStack.top()); // return 2
        System.out.println(minStack.getMin()); // return 1

    }

}

class MinStack {

    int[] miniStack;
    int size = 0;

    public MinStack() {
        miniStack = new int[size];
    }

    public void push(int val) {
        size++;
        miniStack = Arrays.copyOf(miniStack, size);
        miniStack[size-1]=val;
    }

    public void pop() {
        size--;
        miniStack = Arrays.copyOf(miniStack, size);
    }

    public int top() {
        return miniStack[size-1];
    }

    public int getMin() {
        return Arrays.stream(miniStack).min().getAsInt();
    }
}
