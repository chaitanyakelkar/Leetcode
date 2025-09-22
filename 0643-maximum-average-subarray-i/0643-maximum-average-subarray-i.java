class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = l + k - 1;

        int sum = 0;
        for (int i = l; i <= r; i++)
            sum += nums[i];
        double avg = (double)sum / k;
        r++;

        while (r < nums.length){
            sum += nums[r];
            sum -= nums[l];
            r++;
            l++;
            avg = Math.max(avg, (double)sum / k);
        }

        return avg;
    }
}