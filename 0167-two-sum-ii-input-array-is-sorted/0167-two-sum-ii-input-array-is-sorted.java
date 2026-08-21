class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (numbers[start] + numbers[end] != target){
            if (numbers[start] + numbers[end] > target){
                end--;
            } else if (numbers[start] + numbers[end] < target){
                start++;
            }
        }
        int[] res = {start+1, end+1};
        return res;
    }
}