class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) zero++;
            else if (nums[i] == 1) one++;
            else if (nums[i] == 2) two++;
        }

        int i = 0;
        while (i < nums.length && zero > 0){
            nums[i] = 0;
            i++;
            zero--;
        }

        while (i < nums.length && one > 0){
            nums[i] = 1;
            i++;
            one--;
        }

        while (i < nums.length && two > 0){
            nums[i] = 2;
            i++;
            two--;
        }
    }
}