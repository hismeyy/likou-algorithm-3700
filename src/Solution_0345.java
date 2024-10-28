/**
 * 345. 反转字符串中的元音字母
 * https://leetcode.cn/problems/reverse-vowels-of-a-string/?envType=problem-list-v2&envId=two-pointers&difficulty=EASY
 */
public class Solution_0345 {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        String y = "aAeEiIoOuU";

        int l = 0, r = charArray.length - 1;

        while (l < r) {
            if (y.indexOf(charArray[l]) < 0) {
                l++;
            }

            if (y.indexOf(charArray[r]) < 0) {
                r--;
            }

            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;

        }

        return new String(charArray);

    }
}
