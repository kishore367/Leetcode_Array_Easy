class Solution {
    public int[] decompressRLElist(int[] nums) { 

        int sum=0;

        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        int []arr=new int[sum];

        int x=0;

        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                arr[x++]=nums[i+1];
            }
        }
        return arr;
        
    }
}