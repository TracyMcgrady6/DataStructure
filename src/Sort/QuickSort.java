package Sort;

/**
 * Created by t-mac on 2017/3/20.
 * ����˼�룺������+�ڿ�������
 * �ȴ�������ȡ��һ������Ϊkeyֵ��
 * ���������С����ȫ������������ߣ����ڻ����������ȫ�����������ұߣ�
 * ����������С�����ظ��ڶ�����ֱ��������ֻ��1������
 * <p>
 * ƽ��ʱ�临�Ӷȣ�O(N*logN)
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
