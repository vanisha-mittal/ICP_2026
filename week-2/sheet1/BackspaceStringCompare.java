import java.util.Stack;

public class Solution {

    public static boolean backspaceCompare(String S, String T) {

        // Stack for first string
        Stack<Character> st1 = new Stack<>();

        // Stack for second string
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < S.length(); i++) {

            // Normal character → push into stack
            if (S.charAt(i) != '#') {
                st1.push(S.charAt(i));
            }
            // '#' → remove last character if possible
            else {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            }
        }

        for (int i = 0; i < T.length(); i++) {

            if (T.charAt(i) != '#') {
                st2.push(T.charAt(i));
            }
            else {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            }
        }

        // If final sizes differ, strings are not equal
        if (st1.size() != st2.size()) return false;

        // Compare final characters
        while (!st1.isEmpty()) {
            if (st1.pop() != st2.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String S = "ab#c";
        String T = "ad#c";

        System.out.println(backspaceCompare(S, T)); 
    }
}
