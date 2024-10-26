import java.util.HashSet;

/**
 * 160. 相交链表
 * https://leetcode.cn/problems/intersection-of-two-linked-lists/description/?envType=problem-list-v2&envId=hash-table&favoriteSlug=&difficulty=EASY
 */
public class Solution_0160 {
    /**
     * 哈希表
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (headA != null) {

            if (!hashSet.add(headA)) {
                return headA;
            }
            headA = headA.next;

        }

        while (headB != null) {
            if (!hashSet.add(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }

    /**
     * 双指针 1
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode_2(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        int i = 0, j = 0;
        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1;
            }

            p1 = p1.next;
            if (p1 == null && i == 0) {
                p1 = headB;
                i = 1;
            }

            p2 = p2.next;
            if (p2 == null && j == 0) {
                p2 = headA;
                j = 1;
            }

        }
        return null;
    }

    /**
     * 双指针 2
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode_3(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode p1 = headA, p2 = headB;

        while (p1 != p2) {

            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;

        }

        return p1;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
