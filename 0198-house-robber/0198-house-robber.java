class Solution {
    public int rob(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return rob(nums.length-1, nums, map);
    }
    private int rob(int i, int[] nums, HashMap<Integer,Integer> map){
        if (i < 0){
            return 0;
        }
        if (map.getOrDefault(i, -1) != -1){
            return map.get(i);
        }
        map.put(i, Math.max(rob(i - 2, nums, map) + nums[i], rob(i-1, nums, map)));
        return map.get(i);
    }
}