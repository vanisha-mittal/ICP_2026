import java.util.Stack;

class Solution {

    public static int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();
        int total = 0;

        // Process each operation
        for (String op : operations) {

            switch (op) {

                // "C" → remove last valid score
                case "C":
                    st.pop();
                    break;

                // "D" → double the last score
                case "D":
                    st.push(st.peek() * 2);
                    break;

                // "+" → sum of last two scores
                case "+":
                    int lastElement = st.pop();          // take last score
                    int sum = lastElement + st.peek();   // add with previous
                    st.push(lastElement);                // restore last score
                    st.push(sum);                        // push new score
                    break;

                // Number → push directly
                default:
                    st.push(Integer.parseInt(op));
                    break;
            }
        }

        for (int score : st) {
            total += score;
        }

        return total;
    }

    public static void main(String[] args) {

        String[] operations = {"5", "2", "C", "D", "+"};

        System.out.println(calPoints(operations)); 
    }
}
