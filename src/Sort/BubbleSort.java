package Sort;

/**
 * Created by t-mac on 2017/3/16.
 * 基本思想：两个数比较大小，较大的数下沉，较小的数冒起来。
 * <p>
 * 过程：
 * 比较相邻的两个数据，如果第二个数小，就交换位置。
 * 从后向前两两比较，一直到比较最前两个数据。最终最小数被交换到起始的位置，这样第一个最小数的位置就排好了。
 * 继续重复上述过程，依次将第2.3...n-1个最小数排好位置。
 * <p>
 * 平均时间复杂度：O(n2)
 * <p>
 * 设置标志位flag，如果发生了交换flag设置为true；如果没有交换就设置为false。
 * 这样当一轮比较结束后如果flag仍为false，即：这一轮没有发生交换，说明数据的顺序已经排好，没有必要继续进行下去。
 */
public class BubbleSort {
    public void Sort(int[] num) {
        int temp;
        for (int i = 0; i < num.length - 1; i++) {

            Boolean change = false;

            for (int j = num.length - 1; j > i; j--) {
                //交换
                if (num[j] < num[j - 1]) {
                    temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                    change = true;
                }
            }
            //如果一趟没发生交换，证明已经排好，跳出循环
            if (!change) {
                break;
            }
        }
    }
}
