class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        int n = nums.length;

        for(int j = 0;j<n;j++){
            if(nums[j] == 1){
                currentCount++;
            }else{
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        return Math.max(maxCount,currentCount);
    }
}