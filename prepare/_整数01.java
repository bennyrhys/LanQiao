package prepare;

/**
 * 素数、整数、余数
 * 最大公约数、最小公倍数=乘积/最大公约数
 *
 * a的n次幂对p取模
 * @Author bennyrhys
 * @Date 2020-02-16 15:19
 */
public class _整数01 {
    public static void main(String[] args) {

        int a = 15;
        int b = 40;

        // 原始方法算最大公约数
        for (int i = a; i > 1; i--) {
            if (a%i==0 && b%i==0)
                System.out.println(i);
        }

        // 辗转相除法
        for (;;) {
            if (a == 0){
                System.out.println(b);
                break;
            }

            int t = a;
            a = b % a;
            b = t;
        }

        // 递归-辗转相除【优秀的特性交换位置也没关系】大小交换位置不会引起异常因为取模时候自动交换位置
        System.out.println(gcd(b,a));


        // a的n次幂对p取模
        System.out.println(f(3,5000,17));

    }
    // 幂 取模【因为远大于int溢出】
    private static int f(int a, int b, int p) {
        int x = 1;
        for (int i = 0; i < b; i++) {
            x = (x * a) % p;
        }
        return x%p;
    }

    // 递归-辗转相除
    private static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b%a, a);
    }

}
