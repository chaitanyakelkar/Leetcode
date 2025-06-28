class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid, leftSize;

        while(left <= right){
            mid = (left + right) / 2;

            if (( mid - 1 < 0 || nums[mid] != nums[mid - 1]) && ( mid + 1 == nums.length || nums[mid] != nums[mid + 1])){
                return nums[mid];
            }

            if (mid - 1 >= 0 && nums[mid] == nums[mid - 1]){
                leftSize = mid - 1;
            } else {
                leftSize = mid;
            }

            if (leftSize % 2 == 1){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}