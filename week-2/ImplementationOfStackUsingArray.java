package week_2;

public class ImplementationOfStackUsingArray {
	class Stack<T>{
        private T[] arr;
        private int top=-1;

        Stack(){
            arr=(T[]) new Object[30];
        }

        public void push(T v) throws Exception{
            if(top==29){
                throw new Exception("stack overflow");
            }
            
            arr[++top]=v;
        }
        public T pop() throws Exception{
            if(top==-1){
                throw new Exception("stack underflow");
            }
            return arr[top--];
            
        }
        public T peek() throws Exception{
            if(top==-1){
                throw new Exception("stack is empty");
            }
            return arr[top];
        }
        public boolean isEmpty(){
            return (top==-1);
        }
    }
    public static void main(String[] args){
    	ImplementationOfStackUsingArray obj=new ImplementationOfStackUsingArray();
        Stack<Integer> st=obj.new Stack<>();
        try {
	        st.push(30);
	        st.push(20);
	        System.out.println(st.peek());
	        while(!st.isEmpty()){
	            System.out.println(st.pop());
	        }
	        System.out.println(st.pop());
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}