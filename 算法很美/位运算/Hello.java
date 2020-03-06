package 算法很美.位运算;

/**
 * 理论知识
 * @Author bennyrhys
 * @Date 2020-02-18 18:59
 */
public class Hello {
    /**
     * 二进制比较时按位比较
     * &与 |或 ~非/取反 ^异或（相反取1相同取0）
     * <<左移 >>右移动 >>>最高位0填充 >>最高位符号填充 <<<没有运算符
     *
     *
     */

    public static void main(String[] args) {
        // int 32=4*8 long 64=8*8
        System.out.println(1<<35);
        System.out.println(1<<3);

        // 判断奇数偶数
        System.out.println(7& 1); //x与1= 1是奇数
        System.out.println(2 & 1);//x与1= 0是偶数

        System.out.println(3 & 1);
    }
}
