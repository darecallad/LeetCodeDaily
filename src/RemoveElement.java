

public class RemoveElement {
    // O(n)
    public int removeElement(int[] nums, int val){
        // set the starting point i
        int i = 0;
        for( int j = 0 ; j < nums.length; j ++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
