class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = Arrays.stream(nums).sum();
        int leftsum = 0;
        for(int i=0;i<n;i++){
            if(leftsum == total-leftsum-nums[i]){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}