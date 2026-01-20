public class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='#' ){
                st1.push(S.charAt(i));
            }
            else {
                if(!st1.isEmpty()) st1.pop();
            }
        }
        for(int i=0;i<T.length();i++){
            if(T.charAt(i)!='#' ){
                st2.push(T.charAt(i));
            }
            else {
                if(!st2.isEmpty()) st2.pop();
            }
        }
        if(st1.size()!=st2.size()) return false;
        while(!st1.isEmpty()){
            if(st1.pop()!=st2.pop()) return false;
        }
        return true;
    }
}