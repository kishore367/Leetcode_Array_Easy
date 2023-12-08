int differenceOfSum(int* nums, int numsSize) {
    int ans=0;
    for(int i=0;i<numsSize;i++){
        int val=nums[i];
        ans=ans+val;

        while(val){
            ans=ans-val%10;
            val=val/10;
        }
    }
    return ans;
    
}