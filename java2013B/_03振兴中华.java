package java2013B;

/**
 * @Author bennyrhys
 * @Date 2020-03-09 22:59
 * 小明参加了学校的趣味运动会，其中的一个项目是：跳格子。
 * 地上画着一些格子，每个格子里写一个字，如下所示：
 *
 *
 * 从我做起振
 * 我做起振兴
 * 做起振兴中
 * 起振兴中华
 *
 *
 * 比赛时，先站在左上角的写着“从”字的格子里，可以横向或纵向跳到相邻的格子里，但不能跳到对角的格子或其它位置。一直要跳到“华”字结束。
 * 要求跳过的路线刚好构成“从我做起振兴中华”这句话。
 * 请你帮助小明算一算他一共有多少种可能的跳跃路线呢？
 *
 */
public class _03振兴中华 {
    public static void main(String[] args) {
        int count = f(0,0);
        System.out.println(count);
    }

    // 深搜 递归-【重复、变化、边界】
    private static int f(int i, int j) {
        if (i == 3 || j == 4 )
            return 1;
        return f(i+1, j) + f(i, j+1);
    }
}
