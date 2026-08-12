// Last updated: 12/08/2026, 11:49:08
import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < words.length) {
            int lineLen = words[i].length();
            int j = i + 1;
            
            // Greedy: pack words into the line
            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
                lineLen += 1 + words[j].length();
                j++;
            }
            
            int gaps = j - i - 1;
            StringBuilder sb = new StringBuilder();
            
            // Last line or single word → left-justified
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } else {
                // Fully justified
                int totalSpaces = maxWidth - (lineLen - gaps);
                int spacePerGap = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;
                
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < spacePerGap; s++) sb.append(" ");
                        if (extraSpaces > 0) {
                            sb.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }
            
            result.add(sb.toString());
            i = j;
        }
        
        return result;
    }
}
