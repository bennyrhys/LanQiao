package prepare;

/**
 * 杨辉三角，某层的全部元素
 * @Author bennyrhys
 * @Date 2020-02-15 20:41
 */
public class _经典递归问题04 {
    public static void main(String[] args) {
        int level = 3;
        for (int i = 0; i <= level ; i++)
        System.out.print(f(level,i)+" ");
        System.out.println();
    }

    private static int f(int level, int i) {
        if (i == 0) return 1;
        if (level == i) return 1;

        // 规律：上左+上 = 下
        return f(level-1, i) + f(level-1, i);
    }
}
