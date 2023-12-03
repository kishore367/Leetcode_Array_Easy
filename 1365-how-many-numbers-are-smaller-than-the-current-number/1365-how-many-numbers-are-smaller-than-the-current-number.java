class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] ans = new int[nums.length];
    int[] count = new int[101]; 
    for(int i=0;i<nums.length ;i++){
        count[nums[i]]++;
    }
    for(int i=1;i<count.length;i++){
        count[i] += count[i-1];
    }
    for(int i=0;i<nums.length ;i++){
        if(nums[i] == 0){
            ans[i] = 0;
        }else{
            ans[i] = count[nums[i]-1];
        }
    }
    return ans;
}
}
/*
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // declare answer array
        int[] ans = new int[nums.length];
        // iterate over nums in i loop
        for(int i = 0; i < nums.length; i++) {
            // declare counter
            int count = 0;
            // iterate over nums in j loop
            for(int j = 0; j < nums.length; j++) {
                // check that nums at i and j are not equals and j num is less than i num. if true increment counter
                if(nums[i] != nums[j] && nums[j] < nums[i]) count++;
            }
            // set i-th index of answer array as count
            ans[i] = count;
        }
        // return answer array
        return ans;
    }
}
*/