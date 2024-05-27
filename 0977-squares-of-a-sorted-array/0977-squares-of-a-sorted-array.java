class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int smallerIndex = 0;
        int largerIndex = nums.length - 1;
        
        int[] result = new int[nums.length];
        
        for (int i=nums.length-1; i>=0; i--){
            if (Math.abs(nums[largerIndex]) > Math.abs(nums[smallerIndex])) {
                result[i] = nums[largerIndex] * nums[largerIndex];
                largerIndex -= 1;
            } else {
                result[i] = nums[smallerIndex] * nums[smallerIndex];
                smallerIndex += 1;
            }
        }
        return result;        
    }
}