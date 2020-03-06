package prepare;

import java.util.Scanner;

/**
 * 高僧斗法
 * 楼梯上几个小和尚，两个斗法每次移动两个人。谁不能再移动谁就输【不可越过。到达顶端，不可再移动】
 * 输入
 * 小和尚的位置
 * 输出
 * 此时需要移动的小和尚的位置
 * 样例
 * 1 5 9
 * 1 4
 *
 * 【尼姆-博弈问题】
 * 几堆硬币，每次只取一堆中的若干硬币，最后谁没得取，谁就输！
 * 3 4 5
 * 二进制转换，保证数列都是偶数
 *   1 1
 * 1 0 0
 * 1 0 1
 * @Author bennyrhys
 * @Date 2020-02-16 20:13
 */
public class _整数04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] x = new int[s.length];

        for (int i = 0; i < s.length; i++)
            x[i] = Integer.parseInt(s[i]);

        solve(x);
    }

    public static boolean f(int x[]){
        int sum=0;
        for(int i=0;i<x.length-1;i+=2){
            /*
             * 相邻两个人差几个空台阶
                java ~ 操作符，对每个二进制位的内容求反，即1变成0，0变成1
                java & 操作符，对应的二进制位进行与操作，两个都为1才为1，其他情况均为0
                java | 操作符，对应的二进制位进行或操作，两个都为0才为0，其他情况均为1
                java ^ 操作符 当对应二进制位值相同，该位为0 否则为1
                java << 操作符，左边移动，右面填充0
                java >> 操作符，左边移动，右面填充0

             */
            sum^=(x[i+1]-x[i]-1);
        }
        return sum!=0;
    }
    //转换为尼姆堆
    public static void solve(int x[]){
        for(int i=0;i<x.length-1;i++)
            for(int k=x[i]+1;k<x[i+1];k++){
                int old=x[i];
                try{
                    x[i]=k;//试探
                    if(f(x)==false){
                        System.out.println(old+" "+k);
                        return;
                    }
                }finally{
                    x[i]=old;//回溯
                }
            }
    }
}
