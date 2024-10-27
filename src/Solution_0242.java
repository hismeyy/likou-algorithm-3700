import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 242. 有效的字母异位词
 * https://leetcode.cn/problems/valid-anagram/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0242 {

    /**
     * 哈希表
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram_1(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        for (char sChar : sCharArray) {
            if (hashMap.containsKey(sChar)) {
                hashMap.put(sChar, hashMap.get(sChar) + 1);
            } else {
                hashMap.put(sChar, 1);
            }
        }

        for (char tChar : tCharArray) {
            Integer value = hashMap.get(tChar);
            if (null != value) {
                if (value == 0) {
                    return false;
                } else {
                    hashMap.put(tChar, hashMap.get(tChar) - 1);
                }
            } else {
                return false;
            }
        }


        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * 排序
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram_2(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    }
}
