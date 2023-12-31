package src.problems;

public class LC_1646_GetMaxInGeneratedArray {

    public int getMaximumGenerated(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int ans = Integer.MIN_VALUE;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            if(i % 2 == 0) dp[i] = dp[i/2];
            else dp[i] = dp[i/2] + dp[i/2 + 1];
            ans = Integer.max(ans, dp[i]);
        }
        return ans;
    }

}
