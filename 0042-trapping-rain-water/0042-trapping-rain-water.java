class Solution {
    public int trap(int[] height) {
        if (height.length < 3) return 0;

        int lmax[] = new int[height.length];
        int rmax[] = new int[height.length];
    
        lmax[0] = height[0];
        for(int i = 1; i < lmax.length; i++){
            lmax[i] = Math.max(lmax[i-1], height[i]);
        }

        rmax[rmax.length - 1] = height[height.length - 1];
        for(int i = rmax.length - 2; i >= 0; i--){
            rmax[i] = Math.max(rmax[i+1], height[i]);
        }

        int sum = 0;
        for (int i = 1; i < height.length - 1; i++){
            sum += Math.min(lmax[i], rmax[i]) - height[i];
        }
        return sum;
    }
}