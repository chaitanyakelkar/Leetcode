class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++){
            if (cur == 0 && nums[i] == 1) cur = 1;
            else if (nums[i] == 1 && nums[i-1] == 1) cur++;
            else if (nums[i] == 0) cur = 0;

            max = Math.max(max, cur);
        }
        return max;
    }
}