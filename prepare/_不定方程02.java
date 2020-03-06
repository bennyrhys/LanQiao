package prepare;

import java.awt.font.FontRenderContext;
import java.math.BigInteger;

/**
 * 水仙花数变形N=3 1^3 + 5^3 + 3^3 = 153
 * 假设结果为N=21 加和，输出所有可能性
 * 思想
 * 此时无法用不定式，数值范围超过long的19位。BigDecimal也不行
 * 注意:
 * 0-9的^21可以提前算出来
 * 求和跟组成数的位置没关系，只与每个数出现的次数有关系
 * @Author bennyrhys
 * @Date 2020-02-18 21:59
 */
public class _不定方程02 {
    // 初始化大整形数组
    private static BigInteger[] base = new BigInteger[10];

    public static void main(String[] args) {
        for (int i = 0; i < base.length; i++) {
            // 预存^21位的值
            base[i] = calcu_21(i);
            
            // 递归每个数存几次
            int[] a = new int[10];
            f(a, 0, 21);
         }
    }
    // 迭代分配21个数 从数组0开始 sum为剩余次数
    private static void f(int[] a, int k, int sum) {
        // 出口
        if (sum==0) {
            test(a);
            return;
        }
        // 给剩余的sum直接付，相当于到出口
        if (k == a.length-1) {
            a[k] = sum;
//            f(a, k+1, 0);
            test(a);
            return;
        }

        // 核心
        for (int i = 0; i <= sum; i++) {
            a[k] = i;
            f(a, k+1, sum-i);
            a[k] = 0; // 回溯
        }
    }
    // 检验输出
    private static void test(int[] a) {
        BigInteger bn = BigInteger.ZERO;

        for (int i = 0; i < a.length; i++) {
            bn = bn.add(base[i].multiply(BigInteger.valueOf(a[i])));
        }
        String s = bn.toString();
        if (s.length() != 21) return;

        // 定义结果的21位数值 验证
        int[] b = new  int[10];
        for (int i = 0; i < s.length(); i++) {
            b[s.charAt(i)-'0']++;
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i]) return;
        }
        System.out.println(bn);
    }


    // 计算^21
    private static BigInteger calcu_21(int a) {
        BigInteger one = BigInteger.ONE;
        for (int i=0; i<21; i++) {
            one = one.multiply(BigInteger.valueOf(a));
        }
        return one;
    }


}
