class Solution {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    private void dfs(int[] nums, int index, boolean prevIncluded){
        if (index == nums.length){
            result.add(List.copyOf(list));
            return;
        }
        if (index != 0 && nums[index-1] == nums[index] && !prevIncluded){
            dfs(nums, index+1, false);
        } else {
            list.add(nums[index]);
            dfs(nums, index+1, true);
            list.remove(list.size()-1);
            dfs(nums, index+1, false);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, 0, false);
        return result;
    }
}