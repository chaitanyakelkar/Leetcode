class Solution {
    private List<Integer> list = new ArrayList<>();
    private List<List<Integer>> result = new ArrayList<>();

    private void dfs(int index, int[] nums){
        if (index == nums.length){
            result.add(List.copyOf(list));
            return;
        }
        list.add(nums[index]);
        dfs(index+1, nums);
        list.remove(list.size()-1);
        dfs(index+1, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return result;
    }
}