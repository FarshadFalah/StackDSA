import java.util.Stack;

/***
 *<h1> Validate Parentheses</h1>
 * <p>
 * The input string s is valid if and only if:
 * <p>
 * Every open bracket is closed by the same type of close bracket.
 * <p>
 * Open brackets are closed in the correct order.
 * <p>
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * Return true if s is a valid string, and false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "[]"
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "([{}])"
 * <p>
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: s = "[(])"
 * <p>
 * Output: false
 * <p>
 * Explanation: The brackets are not closed in the correct order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 */
public class ValidateParentheses {
    public static void main(String[] args) {
        String s = "[]";
        String s1 = "([{}])";
        String s2 = "[(])";
        String s3 = "]";
        String s4 = ")(){}";
        System.out.println(isValidSwitch(s4)?"is Valid":"Not Valid");
    }

    /***
     * validation with If Else Conditions
     */
    public static boolean isValidIf(String s) {
        Stack<Character> cStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c=='['|c=='('|c=='{') {
                cStack.push(c);
            }
            else if(c==']'){
                if (!cStack.empty()&&cStack.peek()=='['){
                    cStack.pop();
                } else {
                    return false;
                }
            }  else if(c==')'){
                if (!cStack.empty()&&cStack.peek()=='('){
                    cStack.pop();
                } else {
                    return false;
                }
            }  else if(c=='}'){
                if (!cStack.empty()&&cStack.peek()=='{'){
                    cStack.pop();
                } else {
                    return false;
                }
            }
        }
        return cStack.empty();
    }

    /***
     * Validation with Switch Case
     */
    public static boolean isValidSwitch(String s) {
        Stack<Character> cStack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '[' , '(' , '{' -> cStack.push(c);
                case ']' -> {
                    if (cStack.empty() || cStack.pop() != '[') return false;
                }
                case ')' -> {
                    if (cStack.empty() || cStack.pop() != '(') return false;
                }
                case '}' -> {
                    if (cStack.empty() || cStack.pop() != '{') return false;
                }
            }
        }
        return cStack.empty();
    }
}
