package prepare;

/**
 * 错误金额 共几笔款 分别款项。求错误金额的组成款项
 * 输出影响的错误值
 * 0 2
 * 0 3 4
 * 1 2 4
 * 2 3
 * @Author bennyrhys
 * @Date 2020-02-15 22:28
 */
public class _经典递归问题07 {
    public static void main(String[] args) {
        int sum = 6; // 错误金额
        int[] a = {3,2,4,3,1};
        boolean[] b = new boolean[a.length];

        f(6, a, 0, 0, b);
    }

    private static void f(int err_sum, int[] a, int k, int cur_sum, boolean[] b) {

        if (cur_sum > err_sum) return;

        if (err_sum == cur_sum){
            for (int i=0; i<b.length; i++)
                if (b[i]==false) System.out.print(i + " ");
            System.out.println();
            return;
        }

        if (k >= a.length) return;

        b[k] = false;
        f(err_sum, a, k+1, cur_sum, b);

        b[k] = true;
        cur_sum += a[k];
        f(err_sum, a, k+1, cur_sum, b);

        b[k] = false; // 回溯！！！
    }
}
