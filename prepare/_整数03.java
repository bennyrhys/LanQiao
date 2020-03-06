package prepare;

/**
 * 小明的糖果店4、7两种组合方式的糖果
 * 输入：两种包装的糖果数 4 7
 * 输出：最大不能买到的糖果数 17
 * 思路：连续出现4次的前一个数，后面将会都得到
 * @Author bennyrhys
 * @Date 2020-02-16 19:17
 */
public class _整数03 {
    public static final int N = 1000 * 100;
    public static void main(String[] args) {
        f(4, 7);

    }
    // 筛选标记达成组合要求的数组
    private static void f(int a, int b) {
        int[] data = new int[N];

        for (int i = 0; i < N/a; i++) {
            for (int j = 0; j < (N-i*a)/b; j++) {
                if (i*a + b*j < N) data[i*a + b*j] = 1;
            }
        }
        System.out.println(se(data,a));
    }
    // 筛选最大不能买到的糖果数【连续a个的，前一个】
    private static int se(int[] data, int a) {
        int n = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                n++;
                if (n >= a) return i-a;
            }else {
                n = 0;
            }
        }
        return -1;
    }

}
