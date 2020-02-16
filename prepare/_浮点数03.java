package prepare;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * 特殊数值
 * 四舍六入五成双 防止偏差精度，导致分析严重偏离
 * @Author bennyrhys
 * @Date 2020-02-16 14:59
 */
public class _浮点数03 {
    public static void main(String[] args) {

        // 四舍六入五成双0.1666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666667
        BigDecimal b = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(6), new MathContext(100));
        System.out.println(b);


        // IEEE754五种特殊值
        // NAN【不是数值】、0.0【无穷大分之一】、f无穷大
    }
}
