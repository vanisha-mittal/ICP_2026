class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st =new Stack<>();
        for(int a:asteroids){
            if(a>0) st.push(a); // positive asteroids
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-a){ // collision
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==-a){ // collision
                    st.pop();
                    continue;
                } 
                else if(st.isEmpty()||st.peek()<0){ //no collision
                    st.push(a);
                }
            }
        }
        int idx=0;
        int[] ans=new int[st.size()];
        for(int i:st){
            ans[idx++]=i;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={5,10,-5};
        System.out.println(asteroidCollision(arr));
    }
}