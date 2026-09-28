class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int cnt = 0;
        int max = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i] == '('){
                cnt++;
                max = Math.max(cnt,max);
            }
            else if(arr[i] == ')'){
                cnt--;
            }   
        }
        return max;
    }
}