class Solution {
    private int findindex(int[][] mat, int mid){
        int ind = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++){
            if (mat[i][mid] > max){
                max = mat[i][mid];
                ind = i;
            }
        }
        return ind;
    }

    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            int rowindex = findindex(mat, mid);

            int left = mid - 1 >= 0 ? mat[rowindex][mid - 1] : -1;
            int right = mid + 1 < mat[0].length ? mat[rowindex][mid + 1] : -1;

            if (mat[rowindex][mid] > left && mat[rowindex][mid] > right){
                int[] ret = {rowindex, mid};
                return ret;
            } else if (mat[rowindex][mid] < left){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int[] ret = {-1,-1};
        return ret;
    }
}