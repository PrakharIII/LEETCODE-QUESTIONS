import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        
        // Step 1: Compute the square of each element
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        
        // Step 2: Sort the squares in ascending order
        Arrays.sort(squares);
        
        // Step 3: Apply the alternating signs (minus for the first half, plus for the second)
        long ans = 0;
        int m = n / 2;
        for (int i = 0; i < n; i++) {
            if (i < m) {
                ans -= squares[i];
            } else {
                ans += squares[i];
            }
        }
        
        return ans;
    }
}