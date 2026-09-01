class Solution {
    private List<Integer> list = new ArrayList<>();
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> arr = new ArrayList<>();
    private int n;

    private void dfs(){
        if (list.size() == n){
            result.add(List.copyOf(list));
            return;
        }
        for (int i = 0; i < arr.size(); i++){
            int temp = arr.get(i);
            list.add(temp);
            arr.remove(i);
            dfs();
            list.remove(list.size()-1);
            arr.add(i, temp);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        for (int i : nums) arr.add(i);
        n = nums.length;
        dfs();
        return result;
    }
}