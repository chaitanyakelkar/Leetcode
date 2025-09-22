class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        char temp;
        char[] str = s.toCharArray();
        
        boolean[] vowels = new boolean[128];
        for (char c: "aeiouAEIOU".toCharArray()){
            vowels[c] = true;
        }

        while (left < right){
            while (!vowels[str[left]] && left < right) left++;
            while (!vowels[str[right]] && left < right) right--;

            temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }

        return new String(str);
    }
}