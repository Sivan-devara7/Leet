class Solution {
    public int findMiddleIndex(int[] arr) {
       int n = arr.length;
       int total = 0;
       for(int i=0;i<n;i++){
        total += arr[i];
       }
       int left = 0;
       int right = 0;
       for(int i=0;i<n;i++){
        right = total-left-arr[i];
        if(left == right){
            return i;
        }
        else{
            left += arr[i];
        }
       }
        return -1;
    }
}