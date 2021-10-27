import java.util.Arrays;

public class MergeSortedArray {
    //Solution 1
    public void merge(int[] nums1, int m, int[] nums2, int n){
        for(int i = 0; i < n ; i ++){
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
    //Solution 2
    public void merge1(int[] nums1, int m, int[] nums2, int n){
        int[] newnums = new int[m];
        for(int i = 0; i < m ; i ++)
            newnums[i] = nums1[i];

        int p1 = 0; int p2 = 0;

        for( int p = 0; p < m + n; p ++){
            if( p2 >= n || (p1 < m && newnums[p1]< nums2[p2]))
                nums1[p] = newnums[p1++];
            else
                nums1[p] = nums2[p2++];
        }
    }

    //Solution 3
    public void merge2(int[] nums1, int m, int[] nums2, int n){
        int p1 = m -1;
        int p2 = n -1;

        for( int p = m + n -1 ; p >= 0 ; p--){
            if( p2 < 0) break;
            if( p1 >= 0 && nums1[p1] > nums2[p2])
                nums1[p] = nums1[p1--];
            else
                nums1[p] = nums2[p2--];
        }
    }
}
