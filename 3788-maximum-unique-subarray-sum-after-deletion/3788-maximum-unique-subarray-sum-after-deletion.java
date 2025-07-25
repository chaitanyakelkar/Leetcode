class Solution {
    public int maxSum(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i: nums){
            max = Math.max(i, max);
        }

        if (max < 0) return max;

        Set<Integer> set = new HashSet<>();

        for (int i: nums){
            if (i > 0)
                set.add(i);
        }

        for (int i: set){
            sum += i;
        }

        return sum;
    }
}