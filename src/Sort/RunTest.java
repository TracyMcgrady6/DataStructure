package Sort;

/**
 * Created by t-mac on 2017/3/16.
 */
public class RunTest {
    public  static void main(String[] args){
        int[] num={9,4,6,1,3,8,2,4};
        BubbleSort bs=new BubbleSort();
        //bs.Sort(num);
        SelectSort ss =new SelectSort();
//        ss.Sort(num);
        Insertsort is=new Insertsort();
//        is.Sort(num);
        ShellSort shell =new ShellSort();
        shell.Sort(num);
        for (int i:num){

            System.out.println(i);
        }
    }

}
