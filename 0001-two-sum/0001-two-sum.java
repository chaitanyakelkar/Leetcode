class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.getOrDefault(target - nums[i], -1) != -1){
                ans = new int[]{i, map.get(target - nums[i])};
                return ans;
            } else {
                map.put(nums[i], i);
            }
        }

        return ans;
    }
}