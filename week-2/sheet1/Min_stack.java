class MinStack {
    private Stack<Integer> m;
    private Stack<Integer> mini;
    // static int mini;
    public MinStack() {
       m=new Stack<>();
      mini=new Stack<>();
    }
    
    public void push(int val) {
        m.push(val);
        if(mini.isEmpty()|| mini.peek()>=val){
            mini.push(val);
        }
    }
    
    public void pop() {
       int n= m.pop();
        if(n==mini.peek()){
            mini.pop();
        }
    }
    
    public int top() {
        return m.peek();
    }
    
    public int getMin() {
        if(!mini.isEmpty()) 
        return mini.peek();
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */