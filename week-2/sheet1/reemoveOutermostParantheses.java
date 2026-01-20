import java.util.Stack;

class Solution {

    public static String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                st.push(ch);

                // If it's not the outermost '(', keep it
                if (st.size() > 1) {
                    sb.append(ch);
                }
            }
            else {

                // Pop matching '('
                st.pop();

                // If stack is not empty, it's not outermost ')'
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "(()())(())";

        System.out.println(removeOuterParentheses(s)); 
    }
}
