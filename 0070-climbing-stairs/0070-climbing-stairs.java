class Solution {
    public int climbStairs(int n) {
        return fib(n);
    }
    public int fib(int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        return fibHelper(n, map);
    }
    public int fibHelper(int n, HashMap<Integer, Integer> map){
        if (map.getOrDefault(n, -1) != -1){
            return map.get(n);
        }
        if (n == 1){
            return 1;
        }
        if (n == 0){
            return 1;
        }
        map.put(n, fibHelper(n-1, map) + fibHelper(n-2, map));
        return map.get(n);
    }
}