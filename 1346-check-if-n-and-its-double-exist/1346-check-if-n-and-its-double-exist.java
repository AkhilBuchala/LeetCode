import java.util.HashMap;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (store.containsKey(2 * arr[i]) || (arr[i] % 2 == 0 && store.containsKey(arr[i] / 2))) {
                return true;
            }
            store.put(arr[i], i);
        }
        return false;
    }
}
