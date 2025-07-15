class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++){
            if (!Character.isLetterOrDigit(word.charAt(i))) return false;
            if (Character.isLetter(word.charAt(i))){
                char j = word.charAt(i);
                if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u'){
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        if (!hasVowel || !hasConsonant){
            return false;
        }

        return true;
    }
}