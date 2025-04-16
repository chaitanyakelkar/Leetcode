class Solution {
    public void setZeroes(int[][] matrix) {
        boolean r00 = false;
        boolean c00 = false;

        if (matrix[0][0] == 0){
            r00 = true;
            c00 = true;
        }
        // checking for 0t row
        for (int i = 1; i < matrix[0].length; i++){
            if (matrix[0][i] == 0){
                r00 = true;
                break;
            }
        }

        // checking for 0th column
        for (int i = 1; i < matrix.length; i++){
            if (matrix[i][0] == 0){
                c00 = true;
                break;
            }
        }

        //checking remainning cells
        for (int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0; //set 0 in 0th row
                    matrix[i][0] = 0;// set 0 in 0th column
                }
            }
        }

        //set the rest columns to zero
        for (int i = 1; i < matrix[0].length; i++){
            if (matrix[0][i] == 0){
                for (int j = 1; j < matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }

        //set the rest rows to zero
        for(int i = 1; i < matrix.length; i++){
            if (matrix[i][0] == 0){
                for (int j = 1; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        //set 0th row to 0
        if (r00){
            for (int i = 0 ; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }

        //set oth columns to 0
        if (c00){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}