package java2015B;

/**
 * @Author bennyrhys
 * @Date 2020-07-04 22:56
 * 思路：
 * 判断又边界，如果立方过大，位数相加无法相等
 */
public class _02立方变自身 {
    private static int ans;

    public static void main(String[] args) {
        for (int i = 1; i < 99; i++) {
            int i3 = i * i * i;
            int sum = sum(i3);
            if (sum == i) {
                System.out.println(i+" "+i3);
                ans++;
            }
        }
        System.out.println(ans);
    }

    /**
     * 拆分位数相加和
     * @param i3
     * @return
     */
    private static int sum(int i3) {
        // 变成字符串处理相加和
        String s = String.valueOf(i3);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i)-'0';
        }
        return sum;
    }
}
