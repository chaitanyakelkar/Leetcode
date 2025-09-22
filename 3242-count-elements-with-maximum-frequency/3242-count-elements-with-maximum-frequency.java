class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];

        int maxFreq = 0;
        for (int i: nums){
            arr[i]++;
            maxFreq = Math.max(arr[i], maxFreq);
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