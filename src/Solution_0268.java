import java.util.Arrays;
import java.util.HashSet;

/**
 * 268. 丢失的数字
 * https://leetcode.cn/problems/missing-number/solutions/1085105/diu-shi-de-shu-zi-by-leetcode-solution-naow/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0268 {

    /**
     * 哈希表
     *
     * @param nums
     * @return
     */
    public int missingNumber_1(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!hashSet.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 排序
     *
     * @param nums
     * @return
     */
    public int missingNumber_2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
