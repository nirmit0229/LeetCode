class Solution {
    public int[] twoSum(int[] array, int target) {
        int sum = 0;
        for(int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                sum = array[i] + array[j];
                if (sum == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}