class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Integer.MIN_VALUE;
        int right = 0;
        for (int weight: weights){
            left = Math.max(left, weight);
            right += weight;
        }
        int mid, totalWeight, noOfDays;

        while (left <= right){
            mid = left + ((right - left) / 2);

            totalWeight = 0;
            noOfDays = 1;
            for (int weight: weights){
                if (totalWeight + weight > mid){
                    noOfDays++;
                    totalWeight = weight;
                } else {
                    totalWeight += weight;
                }
            }
            if (noOfDays > days){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}