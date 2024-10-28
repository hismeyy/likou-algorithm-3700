/**
 * 344. 反转字符串
 * https://leetcode.cn/problems/reverse-string/description/?envType=problem-list-v2&envId=two-pointers&difficulty=EASY
 */
public class Solution_0344 {
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
