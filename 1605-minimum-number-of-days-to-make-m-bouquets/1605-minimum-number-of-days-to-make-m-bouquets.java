class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m * k) return -1;

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int day: bloomDay){
            left = Math.min(left, day);
            right = Math.max(right, day);
        }
        int mid, count, bouquets;

        while (left <= right){
            mid = left + ((right - left) / 2);

            count = 0;
            bouquets = 0;
            for (int day: bloomDay){
                if (day <= mid){
                    count++;
                    if (count == k){
                        bouquets++;
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            }

            if (bouquets >= m){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}