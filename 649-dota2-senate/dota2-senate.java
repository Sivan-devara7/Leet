class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        ArrayDeque<Integer> r = new ArrayDeque<>();
        ArrayDeque<Integer> d = new ArrayDeque<>();
        char[] arr = senate.toCharArray();

        for(int i=0;i<n;i++){
            if(arr[i]=='R'){
                r.add(i);
            }
            else{
                d.add(i);
            }
        }
        while( !r.isEmpty() && !d.isEmpty()){
            if(r.peek() < d.peek()){
                d.removeFirst();
                r.add(r.removeFirst() + n);
            }
            else{
                r.removeFirst();
                d.add(d.removeFirst() + n);
            }
        }
        if(d.isEmpty()){
            return "Radiant";
        }
        else{
            return "Dire";
        }
    }
}