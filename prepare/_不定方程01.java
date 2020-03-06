package prepare;

/**
 * 根据规模大小
 * 特解 通解
 * @Author bennyrhys
 * @Date 2020-02-18 21:26
 */
public class _不定方程01 {
    // 4x - 5y = 7 大于等于0小于100
    public static void main(String[] args) {
        // 暴力
        for (int i = 0; i < 100; i++)
            for (int j = 0; j < 100; j++) {
                if (4*i - 5*j == 7)
                    System.out.println("x:" +i+"j:"+j);
            }
        /**
         * 求特解 取余为零，两个未知数
         * ax + by = c
         * ax = c - by
         */
/*
        for (int i = 0; i < 100; i++) {
            if ((7 + 5 * i) % 4 == 0) {
                System.out.println("x:"+(7 + 5 * i) / 4+"y:"+i);
            }
        }*/
    }


}
