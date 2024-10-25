import java.util.HashMap;

/**
 * 1. 两数之和
 * https://leetcode.cn/problems/two-sum/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0001 {

    /**
     * 暴力破解
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }

    /**
     * 哈希表
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer temp = target - nums[i];
            if (hashMap.containsKey(temp)) {
                return new int[]{i, hashMap.get(temp)};
            } else {
                hashMap.put(nums[i], i);
            }
        }

        return null;

    }

}
