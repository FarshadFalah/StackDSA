import java.util.Stack;

/***
 * <h1>Evaluate Reverse Polish Notation</h1>
 * <p>
 * You are given an array of strings tokens that represents a valid arithmetic expression in Reverse Polish Notation.
 * <p>
 * Return the integer that represents the evaluation of the expression.
 * <p>
 * The operands may be integers or the results of other operations.
 * <p>
 * The operators include '+', '-', '*', and '/'.
 * <p>
 * Assume that division between integers always truncates toward zero.
 * <p>
 * Example 1:
 * <p>
 * Input: tokens = ["1","2","+","3","*","4","-"]
 * <p>
 * Output: 5
 * <p>
 * Explanation: ((1 + 2) * 3) - 4 = 5
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= tokens.length <= 1000.
 * <p>
 * tokens[i] is "+", "-", "*", or "/", or a string representing an integer in the range [-100, 100].
 */
public class EvaluateReversePolishNotation {

    public static void main(String[] args) {

        System.out.println(evalRPN(new String[]{"1", "2", "+", "3", "*", "4", "-"}));

    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+" -> numbers.push(numbers.pop() + numbers.pop());
                case "-" ->{
                    Integer popped = numbers.pop();
                    numbers.push((numbers.pop()-popped));
                }
                case "*" -> numbers.push(numbers.pop() * numbers.pop());
                case "/" ->{
                    Integer popped = numbers.pop();
                    numbers.push(numbers.pop() / popped);
                }
                default -> numbers.push(Integer.parseInt(s));

            }
        }

        return numbers.pop();
    }
}
