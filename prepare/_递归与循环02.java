package prepare;

/**
 * 数组的循环转递归
 * @Author bennyrhys
 * @Date 2020-02-15 15:18
 */
public class _递归与循环02 {
    /**
     * 数组累加
     */
    public static int a(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i];
        }
        return count;
    }

    /**
     * 数组递归
     */
    public static int f(int[] a, int star) {
        if (star == a.length) return 0;

        return a[star] + f(a, star+1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

//        循环
//        int countout =  a(nums);
//        System.out.println(countout);

//        递归
        int count1out = f(nums, 0);
        System.out.println(count1out);
    }
}
