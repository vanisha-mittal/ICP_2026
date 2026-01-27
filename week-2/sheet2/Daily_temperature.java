class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int val=st.pop();
                ans[val]=i-val;
            }
            st.push(i);
            
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={73,74,75,71,69,72,76,73};
        int[] ans=(dailyTemperatures(arr));
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}