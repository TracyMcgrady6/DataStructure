package Sort;

/**
 * Created by t-mac on 2017/3/16.
 * 基本思想：
 * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
 * 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
 * 。。。
 * 第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成。
 * <p>
 * 平均时间复杂度：O(n2)
 */
public class SelectSort {
    public void Sort(int[] num) {
        int temp;
        int index;
        for (int i = 0; i < num.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[index] > num[j]) {
                    index = j;
                }
            }
            if (index != i) {
                temp = num[i];
                num[i] = num[index];
                num[index] = temp;
            }
        }
    }
}
