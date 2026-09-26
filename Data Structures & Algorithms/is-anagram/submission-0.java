class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        boolean result = true;

        int[] count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        } 
        for(char ch : t.toCharArray()){
            count[ch - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                result = false;
            }
        } 
        return result;
    }
}
