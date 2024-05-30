import java.util.*;

/***
 * <h1>Daily Temperatures</h1>
 * You are given an array of Integers temperatures where temperatures[i] represents the daily temperatures on the ith day.
 * <p>
 * Return an array result where result[i] is the number of days after the ith day before a warmer temperature appears on a future day. If there is no day in the future where a warmer temperature will appear for the ith day, set result[i] to 0 instead.
 * <p>
 * Example 1:
 * <p>
 * Input: temperatures = [30,38,30,36,35,40,28]
 * <p>
 * Output: [1,4,1,2,1,0,0]
 * <p>
 * Example 2:
 * <p>
 * Input: temperatures = [22,21,20]
 * <p>
 * Output: [0,0,0]
 * <p>
 * Constraints:
 * <p>
 * 1 <= temperatures.Length <= 1000.
 * <p>
 * 1 <= temperatures[i] <= 100
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        DailyTemperatures dt = new DailyTemperatures();
        int[] temperatures1 = {30, 38, 30, 36, 35, 40, 28};
        int[] temperatures2 = {22, 21, 20};
        System.out.println(Arrays.toString(dt.dailyTemperatures(temperatures1))); // Output: [1, 4, 1, 2, 1, 0, 0]
//        System.out.println(Arrays.toString(dt.dailyTemperatures(temperatures2))); // Output: [0, 0, 0]
    }
}

