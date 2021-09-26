public class ListNode {
    // float value
    // ListNode next
    // primitif
    private float value;
    private ListNode next;

    // Constructor
    ListNode(float value) {
        this.value = value;
        this.next = null;
    }

    // Set value
    public void setValue(float value) {
        this.value = value;
    }

    // Set node pointer
    public void setNode(ListNode next) {
        this.next = next;
    }

    // Get value
    public float getValue() {
        return this.value;
    }

    // Get node pointer
    public ListNode getNode() {
        return this.next;
    }
}