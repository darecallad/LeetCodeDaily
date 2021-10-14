//Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element appears
// only once. The relative order of the elements should be kept the same.

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;
        // set total num i = 0;
        int i = 0;
        for(int j = i; j <nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i + 1;
    }
}
