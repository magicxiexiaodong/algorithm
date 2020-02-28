/**
 * @Author: XiaoDong.Xie
 * @DateTime: 2020/2/27 11:16
 * @Description: 佛祖保佑，永无bug
 */
public class Test {
    public static void main(String[] args) {
        ListNode node = null;
        ListNode prev = null;

        prev = node;
        node = new ListNode(2);

        System.out.println(prev == null ? 0 : prev.val);
        System.out.println(node.val);


        ListNode node2 = new ListNode(33);
        ListNode prev2 = null;

        prev2 = node2;
        node2.val = 344;

        System.out.println(prev2 == null ? 0 : prev2.val);
        System.out.println(node2.val);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
