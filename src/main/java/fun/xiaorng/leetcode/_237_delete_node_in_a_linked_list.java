package fun.xiaorng.leetcode;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">删除链表中的节点<p/>
 * @github <a href="https://github.com/xihuanxiaorang/leetcode">leetcode</a>
 * @Copyright 博客：<a href="https://xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/11/6 4:20
 */
public class _237_delete_node_in_a_linked_list {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
