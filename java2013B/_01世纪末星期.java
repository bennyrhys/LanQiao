package java2013B;

import java.util.Calendar;

/**
 * @Author bennyrhys
 * @Date 2020-03-06 23:47
 * 题目描述
 * 曾有邪教称1999年12月31日是世界末日。当然该谣言已经不攻自破。
 *
 * 还有人称今后的某个世纪末的12月31日，如果是星期一则会…
 *
 * 有趣的是，任何一个世纪末的年份的12月31日都不可能是星期一!!
 *
 * 于是，“谣言制造商”又修改为星期日…
 *
 * 1999年的12月31日是星期五，请问：未来哪一个离我们最近的一个世纪末年（即xx99年）的12月31日正好是星期天（即星期日）？
 *
 * 请回答该年份（只写这个4位整数，不要写12月31等多余信息）
 *
 * 解题思路
 * 这里用到了Java中的一个日期API——Calendar（1970年后的日期才可以使用这个API）
 *
 * 只需从1999年开始每次增加100年遍历，看看对应世纪末年份12月31日是否为星期日即可停止遍历。
 *
 */
public class _01世纪末星期 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        for (int year = 1999; year < 10000; year+=100) {
            // 传俩参
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, 11);// 12月 从0开始
            calendar.set(Calendar.DAY_OF_MONTH, 31);

            // 验证 1999星期五应该输出6
            System.out.println(year+" "+calendar.get(Calendar.DAY_OF_WEEK));
            if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.println(year);
                break;
            }
        }
    }
}
