import java.util.Stack;

class MinStack {

    // Main stack to store all values
    private Stack<Integer> m;

    // Extra stack to track minimum values
    private Stack<Integer> mini;

    // Constructor to initialize stacks
    public MinStack() {
        m = new Stack<>();
        mini = new Stack<>();
    }

    // Push value into stack
    public void push(int val) {

        // Always push into main stack
        m.push(val);

        // Push into min stack only if it is empty
        // or current value is smaller than or equal to current min
        if (mini.isEmpty() || mini.peek() >= val) {
            mini.push(val);
        }
    }

    // Remove the top element
    public void pop() {

        int removed = m.pop();

        // If removed element is the current minimum,
        // remove it from min stack as well
        if (removed == mini.peek()) {
            mini.pop();
        }
    }

    // Return top element of stack
    public int top() {
        return m.peek();
    }

    // Return minimum element in stack
    public int getMin() {
        if (!mini.isEmpty()) {
            return mini.peek();
        }
        return 0; 
    }

    public static void main(String[] args) {

        MinStack st = new MinStack();

        st.push(5);
        st.push(3);
        st.push(7);

        System.out.println(st.getMin()); // 3
        System.out.println(st.top());    // 7

        st.pop();

        System.out.println(st.top());    // 3
        System.out.println(st.getMin()); // 3
    }
}

