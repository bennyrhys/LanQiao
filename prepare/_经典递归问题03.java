package prepare;

/**
 * 翻转字符串
 * @Author bennyrhys
 * @Date 2020-02-15 20:29
 */
public class _经典递归问题03 {
    public static void main(String[] args) {
        System.out.println(f("abcd"));
    }

    private static String f(String s) {
        //sub时s越来越短
        if (s.length() <= 0)
            return s;

        // 递归到最后往前加
        return f(s.substring(1))+s.charAt(0);
    }
}
