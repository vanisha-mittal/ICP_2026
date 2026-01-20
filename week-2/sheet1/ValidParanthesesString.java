class Solution {

    public static boolean check10ValidString(String s) {

        int min = 0; // minimum possible open parentheses
        int max = 0; // maximum possible open parentheses

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If '(' -> definitely increases open count
            if (ch == '(') {
                min++;
                max++;
            }
            // If ')' -> closes an open bracket
            else if (ch == ')') {

                // Reduce min only if possible
                if (min > 0) min--;

                // Max always decreases
                max--;
            }
            // If '*' -> can act as '(' or ')' or empty
            else {

                // Treat '*' as ')' for min
                if (min > 0) min--;

                // Treat '*' as '(' for max
                max++;
            }

            // If max goes negative, too many ')'
            if (max < 0) return false;
        }

        return min == 0;
    }

    public static void main(String[] args) {

        String s1 = "()";
        String s2 = "(*)";
        String s3 = "(*))";
        String s4 = "((*)";

        System.out.println(check10ValidString(s1)); 
        System.out.println(check10ValidString(s2)); 
        System.out.println(check10ValidString(s3)); 
        System.out.println(check10ValidString(s4)); 
    }
}
