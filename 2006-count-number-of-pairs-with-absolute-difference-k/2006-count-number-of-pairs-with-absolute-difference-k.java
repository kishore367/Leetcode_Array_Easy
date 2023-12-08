class Solution {
    public int countKDifference(int[] nums, int k) {
        int sum=0;
        HashMap <Integer,Integer> result=new HashMap<>();
        for(int i:nums){
            sum+=result.getOrDefault(i-k,0);
            sum+=result.getOrDefault(i+k,0);

            result.put(i,result.getOrDefault(i,0)+1);
        }
        return sum;

        
    }
}