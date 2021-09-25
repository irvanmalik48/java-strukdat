public class LinkedList {
    // atribut ListNode head;
    // primitif
    // implementasikan append
    private ListNode head;
    private int length = 0;
    
    public void add(float value) {
        ListNode node = new ListNode(value);
        node.next = null;

        if (this.head == null)
            this.head = node;
        else {
            ListNode last = this.head;
            while (last.next != null)
                last = last.next;
            last.next = node;
        }

        this.length++;
    }

    public void delete(int index) {
        ListNode current = this.head, previous = null;
        int counter = 0;

        if (index == 0 && current != null)
            this.head = current.next;
        
        while (current != null) {
            if (counter == index) {
                previous.next = current.next;
                current = null;
            }
            else {
                previous = current;
                current = current.next;
                counter++;
            }
        }

        this.length--;
    }

    public void push(float value) {
        ListNode node = new ListNode(value);
        node.next = this.head;
        this.head = node;
        this.length++;
    }

    public void pop() {
        if (this.head == null)
            return;
        if (this.head.next == null)
            return;
        
        ListNode secl = this.head;
        while (secl.next.next != null)
            secl = secl.next;

        secl.next = null;
        this.length--;
    }

    public float getValue(int index) {
        ListNode current = this.head;
        int count = 0;
        while (current != null) {
            if (count == index)
                return current.getValue();
            count++;
            current = current.next;
        }
        return 0;
    }

    public int size() {
        return this.length;
    }

    @Override
    public String toString() {
        ListNode current = this.head;
        String temp = "";
        while (current != null) {
            temp += String.format("%.2f ", current.getValue());
            current = current.next;
        }
        return temp;
    }
}
