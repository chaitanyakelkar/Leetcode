class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums1){
            set.add(i);
        }
        HashSet<Integer> arr = new HashSet<>();
        for (int i: nums2){
            if (set.contains(i) && !arr.contains(i)){
                arr.add(i);
            }
        }
        int[] res = new int[arr.size()];
        int i = 0;
        for (int j: arr){
            res[i++] = j;
        }
        return res;
      }}