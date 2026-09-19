class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        long windowSum = 0;
        long maxSum = 0;

        for (int i = 0; i < n; i++) {

            // Add current element
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Keep window size = k
            if (i >= k) {
                int removed = nums[i - k];

                windowSum -= removed;

                map.put(removed, map.get(removed) - 1);

                if (map.get(removed) == 0) {
                    map.remove(removed);
                }
            }

            // Valid window: size k + all elements distinct
            if (i >= k - 1 && map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}