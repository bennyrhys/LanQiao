package prepare;

/**
 * 字符串比较
 * @Author bennyrhys
 * @Date 2020-02-15 15:47
 */
public class _递归与循环03 {

    /**
     * 方法比较
     */
    private static boolean s(String abc, String abcd) {
        Boolean re;
        re = abc.equals(abcd);
        return re;
    }

    /**
     * 手动比较
     */
    private static boolean f(String a, String b) {
       if (a.length() != b.length()) return false;
       if (a.length() == 0) return true;

       if (a.charAt(0) != b.charAt(0)) return false;
       return f(a.substring(1), b.substring(1));
    }

    public static void main(String[] args) {
//        System.out.println(s("abc","abcd"));

        System.out.println(f("abc","abc"));
    }
}
