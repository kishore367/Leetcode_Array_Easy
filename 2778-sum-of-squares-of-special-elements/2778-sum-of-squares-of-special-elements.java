class Solution {
    public int sumOfSquares(int[] nums) {
        int tot=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length%(i+1)==0)
            ans=ans+ ( nums[i] * nums[i]);

        }
        return ans;
        
    }
}