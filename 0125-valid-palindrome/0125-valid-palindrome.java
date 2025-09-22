class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();

        for (char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                str.append(c);
            }
        }

        s = str.toString();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }

        return true;
    }
}