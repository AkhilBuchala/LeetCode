import java.util.ArrayList;
import java.util.Collection;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> store = new HashMap<>();
        for(int i = 0; i<=arr.length-1;i++ ) {
            if(store.containsKey(arr[i])){
                int value = store.get(arr[i]);
                store.put(arr[i],value+1);
            } else {
                store.put(arr[i],1);
            }
        }
        
        Collection<Integer> storeValues = store.values();
        
        ArrayList<Integer> values = new ArrayList<>(storeValues);
        
       Collections.sort(values);
        
        
        for (int i = 0; i < values.size() - 1; i++) {
            if (values.get(i).equals(values.get(i + 1))) {
                return false;
            } 
              
        }
        
        return true;
        
       
    }
}