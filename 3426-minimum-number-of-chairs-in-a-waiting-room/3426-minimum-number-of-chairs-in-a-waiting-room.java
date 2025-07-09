class Solution {
    public int minimumChairs(String s) {

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        System.out.println(sb);
        int count = 0;
        int result = 0;

        for(int i = 0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch == 'E') {
                count++;
            } else {
                count --;
            }

             result = Math.max(count, result);
        }

        return result;

        
    }
}