class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 1;
        StringBuilder prefix = new StringBuilder(strs[0]);

        while (prefix.length() > 0 && index < strs.length){
            if (prefix.length() != 0 && strs[index].indexOf(prefix.toString()) != 0){
                prefix.deleteCharAt(prefix.length() - 1);
                index = 1;
            } else {
                index++;
            }
        }

        return prefix.toString();
    }
}