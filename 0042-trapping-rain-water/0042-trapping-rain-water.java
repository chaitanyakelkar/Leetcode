class Solution {
    public int trap(int[] height) {
        if (height.length < 3) return 0;
        
        int sum = 0;
        int l = 0;
        int lmax = l;
        int r = height.length - 1;
        int rmax = r;

        while (l < r){
            if (height[lmax] < height[rmax]){
                l++;
                if (height[l] < height[lmax]) sum += height[lmax] - height[l];
                else lmax = l;
            } else {
                r--;
                if (height[r] < height[rmax]) sum += height[rmax] - height[r];
                else rmax = r;
            }
        }
        
        return sum;
    }
}