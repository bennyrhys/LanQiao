package prepare;

/**
 * 总数n，所有组成累加，递减组合
 * @Author bennyrhys
 * @Date 2020-02-15 21:32
 */
public class _经典递归问题06 {
    public static void main(String[] args) {
        int[] a = new int[100];
        f(6, a, 0);
    }

    private static void f(int n, int[] a, int k) {
        if (n<=0) {
            for (int i=0; i<k; i++)
                System.out.print(a[i] + " ");
            System.out.println();
            return;
        }

        for (int i = n; i > 0; i--) {
            if (k>0 && i>a[k-1]) continue;
            a[k] = i;
            f(n-i, a, k+1);
        }
    }
}
