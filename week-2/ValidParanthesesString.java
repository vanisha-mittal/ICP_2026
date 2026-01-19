class Solution {
    public boolean check10ValidString(String s) {
        int min=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                min++;
                max++;
            }
            else if(s.charAt(i)==')'){
                if(min>0) min--;
                max--;
            }
            else{
                if(min>0) min--;
                max++;
            }
            if(max<0) return false;
        }
        return min==0;

    }
}