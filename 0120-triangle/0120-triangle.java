class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] row = new int[triangle.get(triangle.size()-1).size()+1];

        for (int i = triangle.size() - 1; i >= 0; i--){
            for (int j = 0; j < triangle.get(i).size(); j++){
                row[j] = triangle.get(i).get(j) + Math.min(row[j], row[j+1]);
            }
        }

        return row[0];
    }
}