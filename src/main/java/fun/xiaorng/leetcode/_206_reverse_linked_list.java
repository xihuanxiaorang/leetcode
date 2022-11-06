package fun.xiaorng.leetcode;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">反转链表<p/>
 * @github <a href="https://github.com/xihuanxiaorang/leetcode">leetcode</a>
 * @Copyright 博客：<a href="https://xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/11/6 5:41
 */
public class _206_reverse_linked_list {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public ListNode reverseList2(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode pre, ListNode curr) {
        if (curr == null) return pre;
        ListNode next = curr.next;
        curr.next = pre;
        return reverse(curr, next);
    }

    public ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode last = reverseList3(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
