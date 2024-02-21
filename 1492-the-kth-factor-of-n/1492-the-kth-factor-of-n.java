class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if (n % i == 0)  {
                myArray.add(i);
            }
        }
        
        if( myArray.size() >= k) {
            return myArray.get(k-1);
        } else {
            return -1;
        }
        
    }
}