package Sort;

/**
 * Created by t-mac on 2017/3/16.
 * �Ľ��Ĳ�������
 * ����������л�������ʹ�ò����������Ӹ�Ч��
 *
 * ����˼�룺
 * ��Ҫ�����һ�����У�����ĳһ������Ϊ���������У����������зֱ���в�������
 * Ȼ���𽥽�������С,���ظ��������̡�ֱ������Ϊ1,��ʱ�������л�������,�����в�������
 *
 * ƽ��ʱ�临�Ӷȣ�O(n1.5)
 */
public class ShellSort {
    public void Sort(int[] num){
        int temp;
        int gap=num.length;
        while (true){
            gap/=2;
            for (int i=0;i<gap;i++){//�ֳ�gap����
                for(int j=i+gap;j<num.length;j+=gap){//�������н��в�������
                    for (int k=j;k>i;k-=gap){
                        if(num[k]<num[k-gap]){
                            temp=num[k];
                            num[k]=num[k-gap];
                            num[k-gap]=temp;
                        }else {
                            break;
                        }
                    }
                }
            }
            if (gap==1){
                break;
            }
        }
    }
}
