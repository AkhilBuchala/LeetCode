class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intSet1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> intSet2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> intersectionSet = intersection(intSet1, intSet2);
        int[] intArray = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intArray[index++] = num;
        }
        return intArray;
    }
    
    private Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}