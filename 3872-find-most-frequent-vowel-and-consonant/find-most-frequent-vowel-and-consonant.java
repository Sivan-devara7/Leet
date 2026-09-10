class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int vow = 0;
        int cons = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!mpp.containsKey(ch)){
                mpp.put(ch,1);
            }
            else{
                mpp.put(ch, mpp.get(ch)+1);
            }
        }
            for(Map.Entry<Character, Integer> entry: mpp.entrySet()){
                if(entry.getKey()=='a'||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u'){
                    vow = Math.max(vow,entry.getValue());
                }
                else{
                    cons = Math.max(cons,entry.getValue());
                }
            }
            return vow+cons;
    }
}