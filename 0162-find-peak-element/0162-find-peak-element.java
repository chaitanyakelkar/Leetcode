class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right){
            mid = (left + right) / 2;

            if ((mid - 1 < 0 || nums[mid] > nums[mid - 1]) && (mid + 1 >= nums.length || nums[mid] > nums[mid + 1])){
                return mid;
            } else if (mid - 1 >= 0 && nums[mid] < nums[mid - 1]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}