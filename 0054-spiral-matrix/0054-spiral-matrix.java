class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> nums = new ArrayList<>();
        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right){
            // left to right
            for(int i = left; i <= right; i++){
                nums.add(matrix[top][i]);
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++){
                nums.add(matrix[i][right]);
            }
            right--;

            // right to left
            if (top <= bottom){
                for (int i = right; i >= left; i--){
                    nums.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom to top
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    nums.add(matrix[i][left]);
                }
                left++;
            }
        }

        return nums;
    }
}