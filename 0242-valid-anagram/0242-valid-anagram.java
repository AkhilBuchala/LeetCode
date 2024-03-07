class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(t1);
        System.out.println(s1);
         System.out.println(t1);
        
        Boolean result = Arrays.equals(s1,t1);
        return result;
        
        
    }
}