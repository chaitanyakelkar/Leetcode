class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        int l = 0;
        int t = 0;
        int r = matrix[0].length - 1;
        int b = matrix.length - 1;

        while (l < r){
            for (int i = 0; i < r - l; i++){
                temp = matrix[t][l + i];
                matrix[t][l + i] = matrix[b - i][l];
                matrix[b - i][l] = matrix[b][r - i];
                matrix[b][r - i] = matrix[t + i][r];
                matrix[t + i][r] = temp;
            }

            l++;
            r--;
            t++;
            b--;
        }
    }
}