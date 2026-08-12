// Last updated: 12/08/2026, 11:45:39
import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            String[] parts = log.split(" ", 2);
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        Collections.sort(letterLogs, (a, b) -> {
            String[] partsA = a.split(" ", 2);
            String[] partsB = b.split(" ", 2);
            int cmp = partsA[1].compareTo(partsB[1]);
            if (cmp == 0) {
                return partsA[0].compareTo(partsB[0]);
            }
            return cmp;
        });

        letterLogs.addAll(digitLogs);
        return letterLogs.toArray(new String[0]);
    }
}
