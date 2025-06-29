class Solution {
    public int findKthPositive(int[] arr, int k) {
        // linear
        // int y = k;
        // for (int num: arr){
        //     if (num <= y){
        //         y++;
        //     } else {
        //         return y;
        //     }
        // }
        // return y;
        // logarithmic
        int left = 0;
        int right = arr.length - 1;
        int mid, rem;

        while(left <= right){
            mid = left + ((right - left) / 2);
            rem = arr[mid] - (mid + 1);

            if (rem < k){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left + k;
    }
}