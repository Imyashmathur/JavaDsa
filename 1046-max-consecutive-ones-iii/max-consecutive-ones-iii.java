class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int maxCount = 0;
        int start = 0;

        for(int e = 0;e<nums.length;e++){
            if(nums[e] == 0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }
            maxCount = Math.max(maxCount,e-start+1);
        }
        return maxCount;
    }
}