class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        int min = Integer.MAX_VALUE;

        while (left <= right){
            if (nums[left] < nums[right]){
                min = Math.min(min, nums[left]);
                break;
            }

            mid = (left + right) / 2;
            min = Math.min(min, nums[mid]);
            if (nums[mid] >= nums[left]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return min;
    }
}