class Solution {
    public int pivotInteger(int n) {
        // suml  1 ---> x => x * (x + 1) / 2
        // sumr  x ---> n => (n-x+1) * (n + x) / 2
        // suml == sumr ==> x pivot

        for (int i = 1; i <= n; i++) {
            int suml = i * ( i + 1);
            int sumr = (n-i+1) * (n + i);

            if(sumr == suml)
            {
                return i;
            }
        }
        return -1;
    }
}