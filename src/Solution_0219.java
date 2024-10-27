import java.util.HashMap;

/**
 * 219. 存在重复元素 II
 * https://leetcode.cn/problems/contains-duplicate-ii/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 * <p>
 * TODO
 * 滑动窗口
 */
public class Solution_0219 {

    /**
     * 哈希表
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                Integer index = hashMap.get(nums[i]);
                int temp = Math.abs(i - index);

                if (temp <= k) {
                    return true;
                } else {
                    hashMap.put(nums[i], i);
                }

            } else {
                hashMap.put(nums[i], i);
            }
        }

        return false;
    }
}
