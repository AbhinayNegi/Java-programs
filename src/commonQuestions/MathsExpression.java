package commonQuestions;

import java.util.Stack;

public class MathsExpression {

    public static int evaluate(String expression) {

        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();
        char[] tokens = expression.toCharArray();
        boolean prevWasOperator = false;

        for (int i = 0; i < tokens.length; i++) {
            char currentToken = tokens[i];

            // Skip Whitespace
            if (currentToken == ' ')
                continue;


            // Identifying digit and adding it in string then converting it into number and pushing it to the value stack
            if (Character.isDigit(currentToken)) {
                StringBuilder sb = new StringBuilder();
                while (i < tokens.length && Character.isDigit(tokens[i])) {
                    sb.append(tokens[i]);
                    i++;
                }
                i--; // Step back to last traversed character or digit so then if i increment in for loop it does not miss next character in expression string
                values.push(Integer.parseInt(sb.toString()));
            }
            // If opening parenthesis, push it onto ops stack
            else if (currentToken == '(') {
                ops.push(currentToken);
            }
            // If closing parenthesis, solve sub-expression
            else if (currentToken == ')') {
                // Keep solving sub expression as long as there is no opening parenthesis encountered
                while (ops.peek() != '(') {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop(); // Remove the opening parenthesis
            }
            // If operator, process it
            else if (currentToken == '+' || currentToken == '-' || currentToken == '*' || currentToken == '/') {
                // Resolve operators with higher or equal precedence
                while (!ops.isEmpty() && hasPrecedence(currentToken, ops.peek())) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(currentToken);
            }
        }

        // Apply remaining operators
        while (!ops.isEmpty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    // Helper to check operator precedence
    // It checks that topOfStackOperator operator at top of the stack has higher or equal precedence than the current operator currentOperator
    private static boolean hasPrecedence(char currentOperator, char topOfStackOperator) {
        if (topOfStackOperator == '(' || topOfStackOperator == ')')
            return false;
        if ((currentOperator == '*' || currentOperator == '/') && (topOfStackOperator == '+' || topOfStackOperator == '-'))
            return false;
        return true;
    }

    // Helper to apply an operator to two operands
    private static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(evaluate("100 * (2 + 12) / 14")); // Output: 100
    }
}

