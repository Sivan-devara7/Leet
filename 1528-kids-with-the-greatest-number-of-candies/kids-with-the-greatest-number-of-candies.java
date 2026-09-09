class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int xtra) {
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]+=xtra;
            if(arr[i]>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}