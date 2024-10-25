import java.util.HashMap;

/**
 * 13. 罗马数字转整数
 * https://leetcode.cn/problems/roman-to-integer/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0002 {
    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        char[] charArray = s.toCharArray();

        int res = 0;

        for (int i = 0; i < charArray.length; i++) {
            Integer value = hashMap.get(charArray[i]);
            if (i < charArray.length - 1 && hashMap.get(charArray[i + 1]) > value) {
                res = res - value;
            } else {
                res = res + value;
            }
        }

        return res;
    }
}
