class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: nums){
            if (map.getOrDefault(i, -1) == -1){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }

        int max = 0;
        for (int i: nums){
            if (map.getOrDefault(i + 1, -1) != -1){
                max = Math.max(max, map.get(i)+map.get(i+1));
            }
        }

        return max;
    }
}