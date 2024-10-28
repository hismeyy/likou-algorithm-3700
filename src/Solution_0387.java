import java.util.HashMap;

/**
 * 387. 字符串中的第一个唯一字符
 * https://leetcode.cn/problems/first-unique-character-in-a-string/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0387 {
    /**
     * 双指针
     *
     * @param s
     * @return
     */
    public int firstUniqChar_1(String s) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int j = 0;
            for (; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && i != j) {
                    break;
                }
            }

            if (j == charArray.length) {
                return i;
            }
        }


        return -1;
    }

    /**
     * 哈希表
     *
     * @param s
     * @return
     */
    public int firstUniqChar_2(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            Integer val = hashMap.get(charArray[i]);
            if (val == 1) {
                return i;
            }
        }

        return -1;

    }
}
