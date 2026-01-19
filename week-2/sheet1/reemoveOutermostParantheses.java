class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char i: s.toCharArray()){
            if(i=='('){
                st.push(i);
                if(st.size()>1){
                    sb.append(i);
                }
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    sb.append(i);
                }
            }
        }
        return sb.toString();
    }
}