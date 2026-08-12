// Last updated: 12/08/2026, 11:47:24
import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        
        Map<Character, String> mapPatternToWord = new HashMap<>();
        Map<String, Character> mapWordToPattern = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            if (mapPatternToWord.containsKey(c)) {
                if (!mapPatternToWord.get(c).equals(word)) return false;
            } else {
                mapPatternToWord.put(c, word);
            }
            
            if (mapWordToPattern.containsKey(word)) {
                if (mapWordToPattern.get(word) != c) return false;
            } else {
                mapWordToPattern.put(word, c);
            }
        }
        
        return true;
    }
}
