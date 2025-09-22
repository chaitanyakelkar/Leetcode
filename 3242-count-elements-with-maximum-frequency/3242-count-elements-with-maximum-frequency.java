class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];

        for (int i: nums){
            arr[i]++;
        }

        int maxFreq = 0;
        for (int i: arr){
            maxFreq = Math.max(i, maxFreq);
        }

        int count = 0;
        for (int i: arr){
            if (i == maxFreq){
                count++;
            }
        }

        return maxFreq * count;
    }
}