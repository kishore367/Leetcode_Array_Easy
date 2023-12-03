class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ind=0;
        int  sum=0;

        for(int n:nums){
            int bits=countpairs(ind++);
            if(bits==k){
                sum+=n;
            }
        }
        return sum;
        
    }

    public int countpairs(int n){
        int count=0;

        while(n>0){
            if(n%2!=0){
                count++;
            }
            n=n/2;
        }
        return count;
    }
}