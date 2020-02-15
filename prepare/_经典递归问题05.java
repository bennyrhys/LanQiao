package prepare;

/**
 * m个A和n个B，有多少种组合方式
 * @Author bennyrhys
 * @Date 2020-02-15 20:57
 */
public class _经典递归问题05 {
    public static void main(String[] args) {
        System.out.println(f(3,1));
    }

    private static int f(int m, int n) {
        if (m == 0 || n ==0) return 1;

        return f(m-1, n) + f(m, n-1);
    }
}
