package Sort;

/**
 * Created by t-mac on 2017/3/16.
 * ��Ҫ�����һ�����У��ٶ�ǰn-1�����Ѿ��ź������ڽ���n�����嵽ǰ������������У�ʹ����n����Ҳ���ź�˳��ġ�
 * ��˷���ѭ����ֱ��ȫ���ź�˳��
 * <p>
 * ƽ��ʱ�临�Ӷȣ�O(n2)
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
                }else {//���轻������ѭ��
                    break;
                }
            }
        }
    }
}
