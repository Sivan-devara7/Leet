class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = 0;
        Map<Integer,Integer> freq = new HashMap<>();
        freq.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                sum+=1;
            }
            else{
                sum += -1;
            }
            if(freq.containsKey(sum)){
                max = Math.max(max, i - freq.get(sum));
            }
            else{
                freq.put(sum, i);
            }
        }
        return max;
    }
}