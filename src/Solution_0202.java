/**
 * 202. 快乐数
 * https://leetcode.cn/problems/happy-number/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0202 {
    /**
     * 快慢指针判断是否循环
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        int solw = n, fast = n;
        do {
            solw = bitSquareSum(solw);
            fast = bitSquareSum(fast);
            fast = bitSquareSum(fast);
        } while (solw != fast);

        return solw == 1;
    }

    private int bitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int bit = n % 10;
            sum = sum + bit * bit;
            n = n / 10;
        }
        return sum;
    }
}
