class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        Map<Character, Integer> mpp = new HashMap<>();
        Map<Character, Integer> mpp1= new HashMap<>();
        if(m!=n){
            return false;
        }
        else{
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            
                char ch2 = t.charAt(i);
                mpp1.put(ch2,mpp1.getOrDefault(ch2,0)+1);
            }
            if(mpp.equals(mpp1)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}