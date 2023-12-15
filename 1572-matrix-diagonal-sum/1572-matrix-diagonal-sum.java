class Solution {
    public int diagonalSum(int[][] mat) {
        int len=mat.length;
        int ans=0;
        int mid=len/2;
        for(int i=0;i<mat.length;i++){
            ans+=mat[i][i]+mat[i][len-i-1];
           
        }
        if(len%2==1){
            ans-=mat[mid][mid];
        }
        return ans;
        
    }
}