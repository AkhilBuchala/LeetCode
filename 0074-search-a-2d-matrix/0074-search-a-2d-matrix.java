class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[i].length-1;
        while(i<matrix.length && j>-1) {
            int current = matrix[i][j];
            if(current==target) {
                return true;
            } else if(current<target) {
                i++;
            } else {
                j--;
            }
        }
        
        return false;
        
    }
}