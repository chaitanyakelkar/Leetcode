class Solution {
public:
    long long comb(int n, int r){
        long long ans = 1;
        if (r > n - r) r = n - r; // as nCr = nCn-r
        for (int i = 1; i <= r; i++){
            ans *= n - r + i;
            ans /= i;
        }
        return ans;
    }

    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> pascal;
        pascal.resize(numRows);
        for (int i = 0; i < numRows; i++){
            pascal[i].resize(i+1);
            for (int j = 0; j <= i; j++){
                pascal[i][j] = comb(i,j);
            }
        }
        return pascal;
    }
};