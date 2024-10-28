import java.util.HashMap;

/**
 * 389. 找不同
 * https://leetcode.cn/problems/find-the-difference/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0389 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        char[] array = t.toCharArray();
        for (char c : array) {
            if (hashMap.containsKey(c) && hashMap.get(c) > 0) {
                hashMap.put(c, hashMap.get(c) - 1);
            } else {
                return c;
            }
        }

        return ' ';
    }
}
