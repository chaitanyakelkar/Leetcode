class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right){
            mid = (left + right)/2;

            if (nums[mid] == target){
                return true;
            } else if (nums[mid] > nums[left]){
                // left sorted array
                if (target < nums[left] || target > nums[mid]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] == nums[left]){
                left += 1;
            } else {
                // right sorted array
                if (target < nums[mid] || target > nums[right]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        
        return false;
    }
}