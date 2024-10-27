import java.util.Arrays;
import java.util.HashSet;

/**
 * 217. 存在重复元素
 * https://leetcode.cn/problems/contains-duplicate/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0217 {

    /**
     * 哈希表
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate_1(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (!hashSet.add(num)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 排序
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate_2(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

}
