package Sort;

/**
 * Created by t-mac on 2017/3/16.
 * 改进的插入排序
 * 如果数据序列基本有序，使用插入排序会更加高效。
 *
 * 基本思想：
 * 在要排序的一组数中，根据某一增量分为若干子序列，并对子序列分别进行插入排序。
 * 然后逐渐将增量减小,并重复上述过程。直至增量为1,此时数据序列基本有序,最后进行插入排序。
 *
 * 平均时间复杂度：O(n1.5)
 */
public class ShellSort {
    public void Sort(int[] num){
        int temp;
        int gap=num.length;
        while (true){
            gap/=2;
            for (int i=0;i<gap;i++){//分成gap个组
                for(int j=i+gap;j<num.length;j+=gap){//将子序列进行插入排序
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
