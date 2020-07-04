package java2013B;

import java.util.Scanner;

/**
 * @Author bennyrhys
 * @Date 2020-07-04 21:00
 * 资源限制
 * 时间限制：1.0s   内存限制：256.0MB
 * 问题描述
 * 小明这些天一直在思考这样一个奇怪而有趣的问题：
 *
 * 在1~N的某个全排列中有多少个连号区间呢？这里所说的连号区间的定义是：
 *
 * 如果区间[L, R] 里的所有元素（即此排列的第L个到第R个元素）递增排序后能得到一个长度为R-L+1的“连续”数列，则称这个区间连号区间。
 *
 * 当N很小的时候，小明可以很快地算出答案，但是当N变大的时候，问题就不是那么简单了，现在小明需要你的帮助。
 *
 * 输入格式
 * 第一行是一个正整数N (1 <= N <= 50000), 表示全排列的规模。
 *
 * 第二行是N个不同的数字Pi(1 <= Pi <= N)， 表示这N个数字的某一全排列。
 *
 * 输出格式
 * 输出一个整数，表示不同连号区间的数目。
 *
 * 样例输入1
 * 4
 * 3 2 4 1
 * 样例输出1
 * 7
 * 样例输入2
 * 5
 * 3 4 2 5 1
 * 样例输出2
 * 9
 */
public class _10连号区间 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];// 输出都是从1开始
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) { // 穷举，联号判断方法差值
            int max = arr[i];
            int min = arr[i];
            for (int j = i; j <= n; j++) {
                if (arr[j]>max)max=arr[j];
                if (arr[j]<min)min=arr[j];
                if (i == j){
//                    System.out.printf("[%d, %d]\n", i, j);
                    ans++;
                }else {
                    if (max-min == j-i) {
//                        System.out.printf("[%d, %d]\n", i, j);
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
