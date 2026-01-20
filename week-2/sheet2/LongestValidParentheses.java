//approach 1
class Solution {
    public static void main(String[] args){
        String s="(()";
        System.out.println(longestValidParentheses(s));
        System.out.println(longestValidParentheses2(s));

    }
    public static int longestValidParentheses(String s) {
        int ml=0; //maximum length
        int l=0; //open bracket
        int r=0; //closed bracket
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                ml=Math.max(ml,l*2);
            }
            else if(r>l){ //invalid parantheses
                l=0;
                r=0;
            }
        }
        l=0;
        r=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                ml=Math.max(ml,l*2);
            }
            else if(l>r){
                l=0;
                r=0;
            }
        }
        return ml;
    }
//approach 2
    public static int longestValidParentheses2(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    ans=Math.max(ans,i-st.peek());
                }

            }
        }return ans;
    }
}

