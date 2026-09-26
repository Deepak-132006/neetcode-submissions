class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        String[] words = new String[strs.length];
        for(int i = 0; i < strs.length; i++){
            words[i] = strs[i];
        }
        for(String word : words){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedArray = new String(ch);
            if(!map.containsKey(sortedArray)){
                map.put(sortedArray, new ArrayList<>());
            }
            map.get(sortedArray).add(word);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
