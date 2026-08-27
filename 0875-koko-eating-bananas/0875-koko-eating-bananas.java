class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Integer.MIN_VALUE;
        int mid;
        long eaten;
        for (int i : piles) max = Math.max(max, i);

        while (min <= max){
            mid = min + (max - min) / 2;
            eaten = 0;
            for (int i : piles) eaten += (i + mid - 1) / mid;

            if (eaten <= h){
                max = mid - 1;
            } else if (eaten > h){
                min = mid + 1;
            }
        }

        return min;
    }
}