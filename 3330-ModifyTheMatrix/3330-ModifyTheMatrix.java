// Last updated: 12/08/2026, 11:44:36
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Step 1: Find max in each column
        int[] colMax = new int[n];
        for (int j = 0; j < n; j++) {
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
            colMax[j] = maxVal;
        }
        
        // Step 2: Build answer matrix
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    answer[i][j] = colMax[j];
                } else {
                    answer[i][j] = matrix[i][j];
                }
            }
        }
        
        return answer;
    }
}
