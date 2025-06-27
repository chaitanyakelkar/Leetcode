class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;
        int mid;

        while (left <= right){
            mid = (left + right)/2;
            if (nums[mid] == target){
                first = mid;
                right = mid - 1;
            }
            else if (nums[mid] > target){
                right = mid - 1;
            } else if (nums[mid] < target){
                left = mid + 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        int last = -1;
        while(left <= right){
            mid = (left + right)/2;
            if (nums[mid] == target){
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] > target){
                right = mid - 1;
            }
        }

        int res[] = new int[2];
        res[0] = first;
        res[1] = last;

        return res;
    }
}