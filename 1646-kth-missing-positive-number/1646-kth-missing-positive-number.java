class Solution {
    public int findKthPositive(int[] arr, int k) {
        int y = k;
        for (int num: arr){
            if (num <= y){
                y++;
            } else {
                return y;
            }
        }
        return y;
    }
}