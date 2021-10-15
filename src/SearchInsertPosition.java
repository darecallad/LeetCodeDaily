public class SearchInsertPosition {
    // run time O(log n)
    public int searchInsert(int[] nums, int target){
        // set pivot and left position starting with 0
        int pivot, left = 0;
        int right = nums.length -1;

        while(left <= right ){
            pivot = left + (right -left) / 2;
            if(nums[pivot] == target) return pivot;
            if(target < nums[pivot]) right = pivot -1;
            else left = pivot + 1;
        }
        return left;
    }
}
