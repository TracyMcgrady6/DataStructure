package Sort;

/**
 * Created by t-mac on 2017/3/16.
 * ����˼�룺
 * �ڳ���ΪN�����������У���һ�α���n-1�������ҵ���С����ֵ���һ��Ԫ�ؽ�����
 * �ڶ��α���n-2�������ҵ���С����ֵ��ڶ���Ԫ�ؽ�����
 * ������
 * ��n-1�α������ҵ���С����ֵ���n-1��Ԫ�ؽ�����������ɡ�
 * <p>
 * ƽ��ʱ�临�Ӷȣ�O(n2)
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
