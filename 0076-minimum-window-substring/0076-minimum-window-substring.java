class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;
        int count = 0;

        int[] map = new int[256];
        for (char c : t.toCharArray()){
            map[c]++;
        }

        while (right < s.length()){
            if (map[s.charAt(right)] > 0) count++;
            map[s.charAt(right)]--;

            while (count == t.length()){
                if (right - left + 1 < minLength){
                    minLength = right - left + 1;
                    startIndex = left;
                }

                map[s.charAt(left)]++;
                if (map[s.charAt(left)] > 0) count--;
                left++;
            }

            right++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLength);
    }
}