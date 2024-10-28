import java.util.ArrayList;

public class Solution_0234 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }

        int l = 0, r = arrayList.size() - 1;
        while (l < r) {
            if (arrayList.get(l).compareTo(arrayList.get(r)) != 0) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
