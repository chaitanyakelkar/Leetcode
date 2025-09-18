class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] ans = new int[rains.length];
        Arrays.fill(ans, -1);

        TreeSet<Integer> dryDay = new TreeSet<>();
        HashMap<Integer, Integer> lastRained = new HashMap<>();

        for (int i = 0; i < ans.length; i++){
            if (rains[i] == 0){
                dryDay.add(i);
                ans[i] = 1;
            } else {
                if (lastRained.getOrDefault(rains[i], -1) != -1){
                    Integer dryD = dryDay.ceiling(lastRained.get(rains[i]));
                    if (dryD == null){
                        return new int[]{};
                    }
                    ans[dryD] = rains[i];
                    dryDay.remove(dryD);
                }
                lastRained.put(rains[i], i);
            }
        }

        return ans;
    }
}