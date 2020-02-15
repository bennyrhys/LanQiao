package prepare;

/**
 * 两个串的最大公共子序列的长度
 * 注意：是子序列不是子串
 * 算法：此算法不是最优解 为了熟悉递归 可解、优化
 * @Author bennyrhys
 * @Date 2020-02-15 20:12
 */
public class _经典递归问题02 {
    public static void main(String[] args) {
        int l = f("dab","abbcdef");
        System.out.println(l);
    }

    private static int f(String a, String b) {
        if (a.length()==0 || b.length()==0)
            return 0;
        // 对比第一位，往后累加
        if (a.charAt(0) == b.charAt(0))
            return f(a.substring(1),b.substring(1)) + 1;
        // 如果对比不一致，返回到第二位继续跟对方对比
        else
            return Math.max(f(a.substring(1),b),f(a, b.substring(1)));
    }
}
