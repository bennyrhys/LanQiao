package prepare;

/**
 * 素数：第100002个素数是多少
 * 思想：筛法【除去不是234递增去除不是数素的数】
 * @Author bennyrhys
 * @Date 2020-02-16 16:33
 */
public class _整数02 {
    public static void main(String[] args) {
        int N = 1000 * 1000 * 10;
        int x = 100002;

        byte[] a  = new byte[N];

        // 筛选标记
        for (int i = 2; i<N/2; i++) {
            if (a[i]==1) continue; // 跳过之前标记的和数，没有资格参加筛选

            for (int k=2; k<=N/i; k++) {
                if (i * k < N) a[i*k] = 1; // 选出的i的倍数，非素数的和数标记为1
            }
        }
        // 输出
        int count = 0; //计数器
        for (int i = 2; i < N; i++) {
            if (a[i] == 0) {
                count++;
                if (count == x) {
                    System.out.println(i+":第"+count+"个素数");
                }
            }
        }

    }
}
