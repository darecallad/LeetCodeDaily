//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]

import java.util.HashMap;

public class twoSum {

    // result 1 O(n^2)
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++)
                if(nums[i] + nums[j] == target) return new int[]{i,j};
        }
        return null;
    }
    // result 2
    // map O(n)
    public int[] twoSum1(int[] nums, int target){
        // first import HashMap
        Map<Integer, Integer> map = new HashMap<>();
        // map each element with key
        for(int i = 0; i < nums.length; i ++)
            map.put(nums[i], i);
        // check target exist
        for(int i = 0 ; i < nums.length; i ++){
            int complement = target - nums[i];
            // if exist
            if(map.containsKey(complement) && map.get(complement) != i)
                return new int[] {i, map.get(complement)};
        }
        // else return null
        return null;
    }
    //result 3
    //hashMap One-Pass  O(n) we traverse it only once O(1)
    public int[] twoSum2(int[] nums, int target){
        // first import HashMap
        Map<Integer, Integer> map = new HashMap<>();
        // check each element in the int array
        for(int i = 0; i < nums.length; i ++){
            int complement = target - nums[i];
            // if exist
            if(map.containsKey(complement)) return new int[] {map.get(complement), i};

            // map the element once only
            map.put(nums[i], i);
        }
        //else return null;
        return null;
    }

}
