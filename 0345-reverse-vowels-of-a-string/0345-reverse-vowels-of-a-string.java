class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        char temp;

        StringBuilder str = new StringBuilder(s);

        while (left < right){
            while (!isVowel(s.charAt(left)) && left < right) left++;
            while (!isVowel(s.charAt(right)) && left < right) right--;

            temp = str.charAt(left);
            str.replace(left, left+1, Character.toString(str.charAt(right)));
            str.replace(right, right+1, Character.toString(temp));
            left++;
            right--;
        }

        return str.toString();
    }
    public boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        return false;
    }
}