class Solution {
    public int[] shuffle(int[] nums, int n) {
        // declare result array of n * 2 length
        int[] result = new int[n * 2];
        // ierate over nums array:
        for(int i = 0; i < n; i++) {
            // place nums[i] at result 2 * n
            result[2 * i] = nums[i];
            // place nums[n + i] at result 2 * n  +1
            result[2 * i + 1] = nums[n + i];
        }
        // return result array
        return result;
    }
}