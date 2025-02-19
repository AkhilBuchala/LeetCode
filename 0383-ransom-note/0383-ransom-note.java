class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         HashMap<Character, Integer> rstore = new HashMap<>();
        HashMap<Character, Integer> mstore = new HashMap<>();

        // Count frequency of each character in ransomNote
        for (char ch : ransomNote.toCharArray()) {
            rstore.put(ch, rstore.getOrDefault(ch, 0) + 1);
        }

        // Count frequency of each character in magazine
        for (char ch : magazine.toCharArray()) {
            mstore.put(ch, mstore.getOrDefault(ch, 0) + 1);
        }

        // Check if magazine has enough characters to form ransomNote
        for (char ch : rstore.keySet()) {
            if (mstore.getOrDefault(ch, 0) < rstore.get(ch)) {
                return false;
            }
        }

        return true;
    }
    }
         
    
