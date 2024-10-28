import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0448 {
    /**
     * 哈希表
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            hashSet.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!hashSet.contains(i)) {
                arrayList.add(i);
            }
        }

        return arrayList;
    }
}
