class Solution {
    public boolean binarySearch(int[][] matrix, int rowIdx, int target){
        int left = 0;
        int right = matrix[rowIdx].length - 1;
        int mid;
        while (left <= right){
            mid = (left + right) / 2;

            if (matrix[rowIdx][mid] == target) return true;
            else if (matrix[rowIdx][mid] > target) right = mid - 1;
            else if (matrix[rowIdx][mid] < target) left = mid + 1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int mid;
        while (left <= right){
            mid = (left + right) / 2;

            if (matrix[mid][0] <= target && matrix[mid][matrix[mid].length-1] >= target) return binarySearch(matrix, mid, target);
            else if (matrix[mid][0] > target) right = mid - 1;
            else if (matrix[mid][matrix[mid].length-1] < target) left = mid + 1;
        }

        return false;
    }
}