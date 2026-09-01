class Solution {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    private void dfs(int[] candidates, int start, int sum, int target) {
        if (sum > target) return;
        if (sum == target){
            result.add(List.copyOf(list));
            return;
        }
        for (int i = start; i < candidates.length; i++){
            list.add(candidates[i]);
            dfs(candidates, i, sum + candidates[i], target);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, 0, 0, target);
        return result;
    }
}