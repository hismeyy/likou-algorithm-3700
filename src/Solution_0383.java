import java.util.HashMap;

/**
 * 383. 赎金信
 * https://leetcode.cn/problems/ransom-note/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 * <p>
 * TODO
 * 字符统计
 */
public class Solution_0383 {
    /**
     * 哈希表
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] charArray = magazine.toCharArray();
        for (char c : charArray) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        char[] array = ransomNote.toCharArray();
        for (char c : array) {
            if (hashMap.containsKey(c) && hashMap.get(c) > 0) {
                hashMap.put(c, hashMap.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;

    }
}
