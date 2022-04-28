import java.util.Stack;

public class ParenthesesChecker {


    public boolean checkParentheses(String testString){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < testString.length(); i++){

            char x = testString.charAt(i);

            if (x != '(' && x != ')'
                    && x != '[' && x != ']'
                    && x != '{' && x != '}'
                    && x != '<' && x != '>'){
                continue;
            }
            if (x == '(' || x == '[' || x == '<' || x == '{'){
                stack.push(x);
            }

            if(stack.isEmpty()) {
                return false;
            }

            char compare = stack.peek();

            if ((compare == '(' && x == ')') || (compare == '[' && x == ']') || (compare == '{' && x == '}') || (compare == '<' && x == '>')) {
                stack.pop();
            }

        }
        return (stack.isEmpty());

    }
}
