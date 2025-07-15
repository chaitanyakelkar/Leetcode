class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;
        HashSet<Character> vowels = new HashSet<>();
        for (Character i: "aeiou".toCharArray()){
            vowels.add(i);
        }
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++){
            if (!Character.isLetterOrDigit(word.charAt(i))) return false;
            if (Character.isLetter(word.charAt(i))){
                if (vowels.contains(word.charAt(i))){
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