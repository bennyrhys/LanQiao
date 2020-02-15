package prepare;

/**
 * 模拟0-9的循环和递归
 * @Author bennyrhys
 * @Date 2020-02-15 14:59
 */
public class _递归与循环01 {
    /**
     * 反向递归9-0
     */
    public static void f(int n) {
        System.out.println(n);
        if (n > 0) f(n-1);
    }

    /**
     * 正向递归0-9
     */
    public static void f2(int star, int end) {

        if (star > end)
            return;

        System.out.println(star);
        f2(star+1, end);
    }


    public static void main(String[] args) {
//      for循环
       /* for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/

//       递归
//       f(9);
        f2(0,9);

    }
}
