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
        // Solution 2
        int currentSubArray = nums[0];
        int maxSubArray = nums[0];

        // starting index 1
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            currentSubArray = Math.max(num, currentSubArray + num);
            maxSubArray = Math.max(maxSubArray, currentSubArray);
        }
        return maxSubArray;
    }
}
