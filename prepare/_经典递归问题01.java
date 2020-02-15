package prepare;

/**
 * 一个字符串的全排列所有情况
 * 思路：遍历每个位置的时候，进行数据换位
 * A B C
 * A C B
 * B A C
 * B C A
 * C B A
 * C A B
 * @Author bennyrhys
 * @Date 2020-02-15 18:04
 */
public class _经典递归问题01 {
    public static void main(String[] args) {
        char[] data = "ABC".toCharArray();
        f(data,0);
    }

    /**
     * 全排列
     * @param data
     * @param i
     */
    private static void f(char[] data, int k) {
        if (k == data.length) {
            for (int i = 0; i < data.length; i++)
                System.out.print(data[i]+" ");
                System.out.println();

        }

        for (int i = k; i < data.length; i++) {
            {char t = data[k]; data[k] = data[i]; data[i] = t;} // 试探
            f(data,k+1);
            {char t = data[k]; data[k] = data[i]; data[i] = t;} // 回溯
        }
    }
}
