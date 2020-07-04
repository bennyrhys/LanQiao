package java2013B;

import java.util.Scanner;

/**
 * @Author bennyrhys
 * @Date 2020-07-04 18:46
 * 资源限制
 * 时间限制：1.0s   内存限制：256.0MB
 * 问题描述
 * 100 可以表示为带分数的形式：100 = 3 + 69258 / 714。
 *
 * 还可以表示为：100 = 82 + 3546 / 197。
 *
 * 注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。
 *
 * 类似这样的带分数，100 有 11 种表示法。
 *
 * 输入格式
 * 从标准输入读入一个正整数N (N<1000*1000)
 *
 * 输出格式
 * 程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。
 *
 * 注意：不要求输出每个表示，只统计有多少表示法！
 *
 * 样例输入1
 * 100
 * 样例输出1
 * 11
 * 样例输入2
 * 105
 * 样例输出2
 * 6
 * 思路：
 * 除法完全整除
 * 全排列：Java没有，需要数组构建（递归思想）
 *
 */
public class _09带分数 {
    static int ans;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] arr = {1, 2, 3};
        f(arr, 0);
        System.out.println(ans);
    }

//    确认某一个排列的第k位
    private static void f(int[] arr, int k) {
        // 全部确认
        if (k == 9) {
            check(arr);
//            print(arr);
            return;
        }
        // 选定第k位（第k位的几种情况遍历）
        for (int i = k; i < arr.length; i++) {
            // 将第i位和第k位交换
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            // 移交下一层，k+1处理
            f(arr,k+1);

            // 回溯
            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
        }
    }

    // 遍历
    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }

    // 检查是否能凑成 带分数等式
    private static void check(int[] arr) {
        // +前的字符最多是7
        for (int i = 1; i <= 7; i++) {
            // 如果此时+号的数额超过N，没必要验算了
            int num1 = toInt(arr, 0, i); // +前面的一段整数
            if (num1 >= N) continue;

            // /号最多j-i-1
            for (int j = 1; j <= 8-i; j++) {
                int num2 = toInt(arr, i, j);
                int num3 = toInt(arr, i+j, 9-i-j);

                if (num2%num3 == 0 && num1+num2/num3 == N){
                    ans++;
                }
            }
        }

    }

    // 数组内数字 转成 数字
    private static int toInt(int[] arr, int pos, int len) {
        int t =1;
        int ans = 0;
        for (int i = pos+len-1; i >= pos ; i--) {
            ans += arr[i]*t;
            t*=10;
        }
        return ans;
    }
}
