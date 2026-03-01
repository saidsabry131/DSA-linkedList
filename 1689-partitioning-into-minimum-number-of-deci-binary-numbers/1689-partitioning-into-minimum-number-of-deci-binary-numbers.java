class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for(char c : n.toCharArray())
        {
            int x = c -'0';
            ans = Math.max(x,ans);
        }

        return ans;
    }
}