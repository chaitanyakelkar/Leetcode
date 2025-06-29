class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        for (int num: nums) right = Math.max(right, num);
        int mid, sum;

        while (left <= right){
            mid = left + ((right - left) / 2);

            sum = 0;
            for(int num: nums){
                sum += (num + mid - 1) / mid;
            }
            if (sum <= threshold){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}