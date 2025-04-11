class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int max_key = 0;

        for (int i = 0; i < nums.length; i++){
            if (! map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()){
            if (set.getValue() > max){
                max = set.getValue();
                max_key = set.getKey();
            }
        }

        return max_key;
    }
}