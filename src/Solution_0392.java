/**
 * 392. 判断子序列
 * https://leetcode.cn/problems/is-subsequence/description/?envType=problem-list-v2&envId=two-pointers&difficulty=EASY
 * TODO
 * 动态规划
 */
public class Solution_0392 {

    /**
     * 双指针
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        int sIndex = 0, tIndex = 0;

        while (sIndex < sCharArray.length && tIndex < tCharArray.length) {
            if (sCharArray[sIndex] != tCharArray[tIndex]) {
                tIndex++;
            } else {
                tIndex++;
                sIndex++;
            }
        }

        return sIndex == sCharArray.length;
    }
}
