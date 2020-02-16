package prepare;

/**
 * 啤酒和饮料
 * 单价2.3，1.9
 * @Author bennyrhys
 * @Date 2020-02-16 13:13
 */
public class _浮点数01 {
    public static void main(String[] args) {
        // == 直接比较
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (2.3 * i + 1.9 * j == 82.3 && i<j)
                    System.out.println(i+ ":" + j);
            }
        }

        // 证明浮点型不准确
        System.out.println(0.1+0.2);
        System.out.println((0.1+0.2) == 0.3);
        System.out.println(Math.abs((0.1+0.2) - 0.3) < 1E-10);

        // 解决性方案 变成整数之间的比较
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (23 * i + 19 * j == 823 && i<j)
                    System.out.println(i+ ":" + j);
            }
        }
    }
}
