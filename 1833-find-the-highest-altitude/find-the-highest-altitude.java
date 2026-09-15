class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] pref = new int[n+1];
        pref[0] = 0;
        for(int i=1;i<=n;i++){
            pref[i] = pref[i-1]+gain[i-1];
        }
        int max = Arrays.stream(pref).max().getAsInt();
        return max;
    }
}