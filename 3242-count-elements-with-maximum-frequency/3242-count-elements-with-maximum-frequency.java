class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i: nums){
            if (map.getOrDefault(i, -1) == -1){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }

        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> set: map.entrySet()){
            max = Math.max(max, set.getValue());
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> set: map.entrySet()){
            if (set.getValue() == max) count++;
        }

        return max * count;
    }
}