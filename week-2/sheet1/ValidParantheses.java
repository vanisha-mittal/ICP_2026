import java.util.Stack;

class Solution {

    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        if (s.length() == 1) return false;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {

                // If no opening bracket available
                if (st.isEmpty()) return false;

                // Check for matching pair
                if (ch == ')' && st.peek() == '(') {
                    st.pop();
                } 
                else if (ch == '}' && st.peek() == '{') {
                    st.pop();
                } 
                else if (ch == ']' && st.peek() == '[') {
                    st.pop();
                } 
                // Mismatched bracket
                else {
                    return false;
                }
            }
        }

        // Stack should be empty for valid parentheses
        return st.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "({[]})";

        System.out.println(isValid(s1)); 
        System.out.println(isValid(s2)); 
        System.out.println(isValid(s3)); 
    }
}
