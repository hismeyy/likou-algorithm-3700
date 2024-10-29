import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 350. 两个数组的交集 II
 * https://leetcode.cn/problems/intersection-of-two-arrays-ii/description/?envType=problem-list-v2&envId=two-pointers&difficulty=EASY
 */
public class Solution_0350 {
    /**
     * 哈希表
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect_1(int[] nums1, int[] nums2) {
        ArrayList<Integer> resList = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums1) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        for (int num : nums2) {
            if (hashMap.containsKey(num) && hashMap.get(num) > 0) {
                hashMap.put(num, hashMap.get(num) - 1);
                resList.add(num);
            }
        }

        int[] res = new int[resList.size()];

        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }

        return res;

    }

    /**
     * 双指针
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect_2(int[] nums1, int[] nums2) {
        ArrayList<Integer> resList = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
                continue;
            }

            if (nums1[i] > nums2[j]) {
                j++;
                continue;
            }

            resList.add(nums1[i]);
            i++;
            j++;
        }


        int[] res = new int[resList.size()];

        for (int x = 0; x < resList.size(); x++) {
            res[x] = resList.get(x);
        }

        return res;
    }
}
