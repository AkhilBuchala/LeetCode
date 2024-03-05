class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        HashMap<String, List<String>> store = new HashMap<>();
       
        for(String s : strs){   
            
            char[] key = s.toCharArray();
            Arrays.sort(key);
            String test = Arrays.toString(key);
            store.putIfAbsent(test, new ArrayList<>());
            store.get(test).add(s);
         
        }
           return new ArrayList<>(store.values());
        
    }
}