public class MaxSubarray {
    public int maxSubArray(int[] nums){
        // Solution 1 Brute way
        int maxSubArray = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i ++){
            int currentSubArray = 0;
            for(int j = i; j < nums.length; j++){
                currentSubArray += nums[j];
                maxSubArray = Math.max(maxSubArray,currentSubArray);
            }
        }
        return maxSubArray;
    }

    public int maxSubArray1(int[] nums){
        //Solution2
    }
}
