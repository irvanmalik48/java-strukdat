public class ListNode {
    // float value
    // ListNode next
    // primitif
    private float value;
    ListNode next;

    ListNode(float value) {
        this.value = value;
        this.next = null;
    }

    public float getValue() {
        return this.value;
    }

    public ListNode getNode() {
        return this.next;
    }
}
