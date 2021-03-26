package shopee;

/**
 * 来源：https://leetcode-cn.com/problems/reverse-nodes-in-k-group/solution/k-ge-yi-zu-fan-zhuan-lian-biao-by-leetcode-solutio/
 * 题目：K 个一组翻转链表
 * 解题思路：
 * 分段转换
 *
 * @author jony.huang
 * @date 2021/3/25 22:01
 */
public class ReverseKGroup {


    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;
        while (true) {
            ListNode tail = head;
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    break;
                }
            }
            ListNode nex = tail.next;
            ListNode[] nodes = reverse(head, tail);
            head = nodes[0];
            tail = nodes[1];
            pre.next = head;
            tail.next = nex;
            pre = tail;
            head = tail.next;
        }


    }


    /**
     * 转换链表
     */
    private ListNode[] reverse(ListNode head, ListNode tail) {
        ListNode prev = tail.next;
        ListNode curr = head;
        while (curr != tail) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return new ListNode[]{tail, head};
    }

    public static class ListNode {
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
