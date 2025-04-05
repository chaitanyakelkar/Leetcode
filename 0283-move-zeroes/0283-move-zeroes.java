class Solution {
    public void moveZeroes(int[] nums) {
        int i = -1;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != 0) nums[++i] = nums[j];
        }
        i++;
        while (i > 0 && i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
}