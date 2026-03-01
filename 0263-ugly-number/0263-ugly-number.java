class Solution {
    public boolean isUgly(int n) {
        if (n<1)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }

        int[] arr = new int[]{2,3,5};
        for(int i : arr)
        {
            if(n%i==0)
            {
               return isUgly(n/i);
            }
        }
     return false;
    }
}