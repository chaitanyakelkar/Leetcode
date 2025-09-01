class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length * matrix[0].length - 1;
        int mid = 0;
        int midval = 0;
        int m = matrix[0].length;

        while (low <= high){
            mid = (low + high) / 2;

            midval = matrix[mid / m][mid % m];
            if (midval == target){
                return true;
            } else if (target > midval){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}