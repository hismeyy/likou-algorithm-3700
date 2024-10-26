import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 * 169. 多数元素
 * https://leetcode.cn/problems/majority-element/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 * <p>
 * TODO
 * 还有两种解题思路，后面看
 * Boyer-Moore 投票算法
 * 分治
 */
public class Solution_0169 {

    /**
     * 哈希表
     *
     * @param nums
     * @return
     */
    public int majorityElement_1(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int max = 0;
        int res = 0;
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);

            } else {
                hashMap.put(num, 0);
            }

            if (max <= hashMap.get(num)) {
                max = hashMap.get(num);
                res = num;
            }
        }

        return res;
    }

    /**
     * 排序 通过观察可以发现，n/2的地方永远是出现次数最多的数（前提是有顺序的条件下）
     *
     * @param nums
     * @return
     */
    public int majorityElement_2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 随机选取
     *
     * @param nums
     * @return
     */
    public int majorityElement_3(int[] nums) {
        Random random = new Random();

        int mid = nums.length / 2;

        while (true) {
            int res = nums[randRange(random, 0, nums.length)];
            if (countCurrentNum(nums, res) > mid) {
                return res;
            }
        }
    }

    private int randRange(Random random, int min, int max) {
        return random.nextInt(max - min) + min;
    }

    private int countCurrentNum(int[] nums, int target) {
        int res = 0;
        for (int num : nums) {
            if (num == target) {
                res++;
            }
        }
        return res;
    }
}
