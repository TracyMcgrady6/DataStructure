package Sort;

/**
 * Created by t-mac on 2017/3/16.
 * 在要排序的一组数中，假定前n-1个数已经排好序，现在将第n个数插到前面的有序数列中，使得这n个数也是排好顺序的。
 * 如此反复循环，直到全部排好顺序。
 * <p>
 * 平均时间复杂度：O(n2)
 */
public class Insertsort {
    public void Sort(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }else {//不需交换跳出循环
                    break;
                }
            }
        }
    }
}
