class Solution {
    public void rev(int arr[], int index){
        int temp;
        for (int i = index; i < ((arr.length-index) / 2)+index; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i+index-1];
            arr[arr.length-i+index-1] = temp;
        }
    }

    public void nextPermutation(int[] nums) {
        boolean drop = false;
        int drop_ind = 0;
        for (int i = nums.length - 1; i > 0; i--){
            if (nums[i] > nums[i-1]){
                drop = true;
                drop_ind = i - 1;
                break;
            }
        }
        if (drop) {
            int min = drop_ind + 1;
            for (int i = drop_ind + 1; i< nums.length; i++){
                if (nums[i] <= nums[min] && nums[i] > nums[drop_ind]) min = i;
            }
            int temp = nums[drop_ind];
            nums[drop_ind] = nums[min];
            nums[min] = temp;
            rev(nums, drop_ind + 1);
        }
        else rev(nums, 0);
    }
}