class Solution {
    public int trap(int[] height) {
        int[] prefixMax = new int[height.length];
        int[] suffixMax = new int[height.length];

        for (int i = 1; i < height.length; i++){
            prefixMax[i] = Math.max(prefixMax[i-1], height[i-1]);
        }
        for (int i = height.length-2; i >= 0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1], height[i+1]);
        }

        int result = 0;
        for (int i = 1; i < height.length-1; i++){
            if (Math.min(prefixMax[i], suffixMax[i]) - height[i] > 0){
                result += Math.min(prefixMax[i], suffixMax[i]) - height[i];
            }
        }

        return result;
    }
}