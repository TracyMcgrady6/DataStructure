package Sort;

/**
 * Created by t-mac on 2017/3/20.
 * 基本思想：（分治+挖坑填数）
 * 先从数列中取出一个数作为key值；
 * 将比这个数小的数全部放在它的左边，大于或等于它的数全部放在它的右边；
 * 对左右两个小数列重复第二步，直至各区间只有1个数。
 * <p>
 * 平均时间复杂度：O(N*logN)
 */
public class QuickSort {
    public void Sort(int[] num, int l, int r) {

        if (l >= r) {
            return;
        }
        int key = num[l];
        int i = l, j = r;

        while (i<j) {
            while (i < j && num[j] >= key) {
                j--;
            }
            if (i < j) {
                num[i] = num[j];
                i++;
            }

            while (i < j && num[i] <= key) {
                i++;
            }
            if (i < j) {
                num[j] = num[i];
                j--;
            }
        }
        num[i] = key;
        Sort(num,l,i-1);
        Sort(num,i+1,r);
    }
}
