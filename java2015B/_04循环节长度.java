package java2015B;

import sun.security.util.Length;

import java.util.Vector;

/**
 * @Author bennyrhys
 * @Date 2020-07-04 23:21
 * 两个整数做除法，有时会产生循环小数，其循环部分称为：循环节。
 * 比如，11/13=6=>0.846153846153.....  其循环节为[846153] 共有6位。
 * 下面的方法，可以求出循环节的长度。
 *
 * 请仔细阅读代码，并填写划线部分缺少的代码。
 *
 * 思路：
 * debug推演死循环，一定要有结束
 * v出现的重复元素，第一次出现和第二次出现的差值
 */
public class _04循环节长度 {
    public static int f(int n, int m)
    {
        n = n % m;
        Vector v = new Vector();

        for(;;)
        {
            v.add(n);
            n *= 10;
            n = n % m;
            if(n==0) return 0;
            if(v.indexOf(n)>=0)  return v.size()-v.indexOf(n);  //填空
        }
    }
    public static void main(String[] args) {
        int a = _04循环节长度.f(11, 13);
        System.out.println(a);
    }
}
