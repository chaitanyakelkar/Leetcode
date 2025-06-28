class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[piles.length - 1];
        for (int i: piles) right = Math.max(right, i);
        int mid;
        long timeTaken;

        while(left <= right){
            mid = (left + right) / 2;

            timeTaken = 0;
            for (int i: piles){
                timeTaken += (i + mid - 1) / mid;
            }

            if (timeTaken <= h){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}