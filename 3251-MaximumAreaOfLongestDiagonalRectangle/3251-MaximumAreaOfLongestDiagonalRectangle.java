// Last updated: 12/08/2026, 11:44:39
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;
        
        for (int[] rect : dimensions) {
            int length = rect[0];
            int width = rect[1];
            
            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;
            
            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }
        
        return maxArea;
    }
}
