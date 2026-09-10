class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
        HashMap<Character, Integer> arr = new HashMap<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(!arr.containsKey(c)){
                arr.put(c,1);
            }
            else{
                return c;
            }
        }
        return '\0';
    }
}