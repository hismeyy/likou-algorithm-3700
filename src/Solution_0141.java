import java.util.HashSet;

/**
 * 141. 环形链表
 * https://leetcode.cn/problems/linked-list-cycle/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY
 */
public class Solution_0141 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 哈希表
     *
     * @param head
     * @return
     */
    public boolean hasCycle_1(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();

        while (head != null) {
            if (!hashSet.add(head)) {
                return true;
            }
            head = head.next;
        }

        return false;
    }

    /**
     * 快慢指针
     *
     * @param head
     * @return
     */
    public boolean hasCycle_2(ListNode head) {
        ListNode p1 = head, p2 = head;

        while (p2 != null && p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                return true;
            }
        }

        return false;
    }
}


