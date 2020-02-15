package prepare;

/**
 * n个球取m个球
 * @Author bennyrhys
 * @Date 2020-02-15 17:23
 */
public class _递归与循环04 {
    public static void main(String[] args) {
        System.out.println(f(3, 2));
    }

    /**
     * 递归取球
     * 思路：记一个特殊球的所有情况加和
     */
    private static int f(int n, int m) {
        if (m > n) return 0;
        if (m == n) return 1;
        if (m == 0) return 1;
        return f(n-1, m-1) + f(n-1, m);
    }
}
