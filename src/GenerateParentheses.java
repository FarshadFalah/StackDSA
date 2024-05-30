import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/***
 *<h1>Generate Parentheses</h1>
 * You are given an integer n. Return all well-formed parentheses strings that you can generate with n pairs of parentheses.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 1
 * <p>
 * Output: ["()"]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: n = 3
 * <p>
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 7
 */
public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(7));
    }

    private static class State {
        String currentString;
        int openCount;
        int closeCount;

        State(String currentString, int openCount, int closeCount) {
            this.currentString = currentString;
            this.openCount = openCount;
            this.closeCount = closeCount;
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Stack<State> stack = new Stack<>();
        stack.push(new State("", 0, 0));

        while (!stack.isEmpty()) {
            State state = stack.pop();

            if (state.currentString.length() == 2 * n) {
                result.add(state.currentString);
                continue;
            }

            if (state.openCount < n) {
                stack.push(new State(state.currentString + "(", state.openCount + 1, state.closeCount));
            }

            if (state.closeCount < state.openCount) {
                stack.push(new State(state.currentString + ")", state.openCount, state.closeCount + 1));
            }
        }

        Collections.reverse(result);

        return result;
    }

}


