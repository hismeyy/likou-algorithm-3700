/**
 * 283. 移动零
 * https://leetcode.cn/problems/move-zeroes/description/?envType=problem-list-v2&envId=two-pointers&difficulty=EASY
 */
public class Solution_0283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
