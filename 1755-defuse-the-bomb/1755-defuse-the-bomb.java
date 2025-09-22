class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length]; 
        for (int i = 0; i < code.length; i++){
            if (k == 0){
                ans[i] = 0;
            } else if (k > 0){
                ans[i] = 0;
                int j = i + 1;
                if (i == code.length - 1) j = 0;
                int size = 1;
                while (size <= k){
                    ans[i] += code[j];
                    j++;
                    size++;
                    if (j == code.length) j = 0;
                }
            } else {
                ans[i] = 0;
                int j = i - 1;
                if (i == 0) j = code.length - 1;
                int size = 1;
                while (size <= -1*k){
                    ans[i] += code[j];
                    j--;
                    size++;
                    if (j == -1) j = code.length-1;
                }
            }
        }

        return ans;
    }
}