class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            pairs.add(new ArrayList<>(List.of(position[i], speed[i])));
        }

        Collections.sort(pairs, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> p1, List<Integer> p2) {
                return p2.get(0) - p1.get(0);
            }
        });

        List<Double> stack = new ArrayList<>();

        for (List<Integer> pair : pairs) {

            double time =
                (double)(target - pair.get(0)) / pair.get(1);

            stack.add(time);

            if (stack.size() >= 2 &&
                stack.get(stack.size() - 1) <=
                stack.get(stack.size() - 2)) {

                stack.remove(stack.size() - 1);
            }
        }

        return stack.size();
    }
}