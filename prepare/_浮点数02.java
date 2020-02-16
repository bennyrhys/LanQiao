package prepare;

/**
 * 海盗比酒
 * 每次喝没倒下的人分之一，船长最后倒下并喝了一瓶，共20人
 * @Author bennyrhys
 * @Date 2020-02-16 14:33
 */
public class _浮点数02 {
    public static void main(String[] args) {
        for (int i = 20; i >= 1 ; i--) {
            for (int j = i-1; j >= 1 ; j--) {
                for (int k = j-1; k >= 1 ; k--) {
                    for (int l = k-1; l >= 1 ; l--) {
                        // 坑：整数相除等于整数
                        // 坑： 浮点数不可用==比较
                        if (Math.abs(1.0/i + 1.0/j + 1.0/k + 1.0/l - 1.0) < 1E-10)
                        // 法2 同分成整数比较
//                        if (j*k*l + i*k*l + i*j*l + i*j*k == i*j*k*l)
                            System.out.println("i:"+i+"j:"+j+"k:"+k+"l:"+l);
                    }
                }
            }
        }
    }
}
