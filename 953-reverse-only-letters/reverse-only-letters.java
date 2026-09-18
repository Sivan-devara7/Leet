class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int left = 0;
        int right = n-1;
        while(left<right){
            if(Character.isLetter(arr[left]) && Character.isLetter(arr[right])){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(!Character.isLetter(arr[left])){
                left++;
            }
            else{
                right--;
            }
        }
        return new String(arr);
    }
    // private boolean isDash(char c){
    //     return "-".indexOf(c) != -1;
    // }
}