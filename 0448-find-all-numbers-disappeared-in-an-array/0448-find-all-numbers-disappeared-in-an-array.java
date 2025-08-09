class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         int[] freq= new int[arr.length+1];

        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
//        System.out.println(Arrays.toString(freq));
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==0 && i!=0)
            {
                result.add(i);
            }
        }
        return result;
    }
}