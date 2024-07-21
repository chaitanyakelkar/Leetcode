class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int col0 = 1;
        int n = matrix.size();
        int m = matrix[0].size();

        // setting -1 in 1st row or coloumn ofr each 0 in ij
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j] == 0){
                    if (j == 0){
                        col0 = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                    matrix[i][0] = 0;
                }
            }
        }

        // turning -1 to 0s except 0rh row and 0th column
        for (int i = 1; i < n; i++){
            for (int j = 1; j < m; j++){
                if (matrix[i][0] == 0){
                    matrix[i][j] = 0;
                } else if (j > 0){
                    if (matrix[0][j] == 0)
                        matrix[i][j] = 0;
                } else if (j == 0 && col0 == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // now changing 0th row and 0th column
        if (col0 == 0){
            for (int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }
        if (matrix[0][0] == 0){
            for (int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }
    }
};