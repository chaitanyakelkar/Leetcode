class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums) set.add(i);
        int maxSequence = 0;

        for (int num: set){
            if (!set.contains(num - 1)){
                int count = 0;
                while (set.contains(num + count)){
                    count++;
                }
                maxSequence = Math.max(maxSequence, count);
            }
        }

        return maxSequence;
    }
}