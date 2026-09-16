class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                arr[st.peek()] = i - st.peek();
                st.pop();
                // st.push(i);
                // arr[i] = Math.abs(temp[i]-temp[i-1]);
            }
            st.push(i);
        }
        return arr;
    }
}