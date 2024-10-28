import java.util.HashSet;

/**
 * 349. 两个数组的交集
 * https://leetcode.cn/problems/intersection-of-two-arrays/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0349 {
    /**
     * 哈希表
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i : nums1) {
            hashSet.add(i);
        }

        for (int num : nums2) {
            if (hashSet.contains(num)) {
                hashSet1.add(num);
            }
        }

        int[] res = new int[hashSet1.size()];
        int i = 0;
        for (Integer o : hashSet1) {
            res[i] = o;
            i++;
        }
        return res;
    }
}
