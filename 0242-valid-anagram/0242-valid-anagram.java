class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) return false;

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i: freq){
            if (i != 0) return false;
        }

        return true;
    }
}