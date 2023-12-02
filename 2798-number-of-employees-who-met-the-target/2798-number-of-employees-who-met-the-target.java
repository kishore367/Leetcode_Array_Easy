class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;

        for(int check:hours){
            if(check>=target){
                count++;
            }
        }
        return count;
        
    }
}