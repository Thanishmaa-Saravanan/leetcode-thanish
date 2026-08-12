// Last updated: 12/08/2026, 11:45:08
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        // Check whether frequencies are unique
        for (int freq : map.values()) {

            if (set.contains(freq)) {
                return false;
            }

            set.add(freq);
        }

        return true;
    }
}