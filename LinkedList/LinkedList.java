public class LinkedList {

	// atribut ListNode head;
	// primitif
	// implementasikan append
	private ListNode head;
	private int length = 0;

	// Append value to the right
	public void add(float value) {
		ListNode node = new ListNode(value);
		node.setNode(null);

		if (this.head == null) this.head = node; else {
			ListNode last = this.head;
			while (last.getNode() != null) last = last.getNode();
			last.setNode(node);
		}

		this.length++;
	}

	// Delete first index value
	public void remove() {
		if (this.head == null) return;
		this.head = this.head.getNode();
		this.length--;
	}

	// Delete value by index
	public void remove(int index) {
		ListNode current = this.head, previous = null;
		int counter = 0;

		if (index == 0 && current != null) this.head = current.getNode();

		while (current != null) {
			if (counter == index) {
				previous.setNode(current.getNode());
				current = null;
			} else {
				previous = current;
				current = current.getNode();
				counter++;
			}
		}

		this.length--;
	}

	// Append value to the left
	public void push(float value) {
		ListNode node = new ListNode(value);
		node.setNode(this.head);
		this.head = node;
		this.length++;
	}

	// Delete last index value
	public void pop() {
		if (this.head == null) return;
		if (this.head.getNode() == null) return;

		ListNode secl = this.head;
		while (secl.getNode().getNode() != null) secl = secl.getNode();

		secl.setNode(null);
		this.length--;
	}

	// Get value by index
	public float getValue(int index) {
		ListNode current = this.head;
		int count = 0;
		while (current != null) {
			if (count == index) return current.getValue();
			count++;
			current = current.getNode();
		}
		return 0;
	}

	// Set value by index
	public void setValue(int index, float value) {
		ListNode current = this.head;
		int count = 0;
		boolean toggle = false;
		while (current != null && !toggle) {
			if (count == index) {
				current.setValue(value);
				toggle = true;
			}
			count++;
			current = current.getNode();
		}
	}

	// Get LinkedList length
	public int size() {
		return this.length;
	}

	// Convert to Array
	public float[] toArray() {
		float arr[] = new float[this.length];
		int index = 0;
		ListNode current = this.head;

		while (current != null) {
			arr[index] = current.getValue();
			current = current.getNode();
			index++;
		}
		return arr;
	}

	// Clear all values
	public void clear() {
		for (int i = 0; i < size(); i++) remove();
		this.length = 0;
	}

	// Check if list is empty
	public boolean isEmpty() {
		if (this.head == null) return true; else return false;
	}

	// toString override
	@Override
	public String toString() {
		ListNode current = this.head;
		String temp = "";
		while (current != null) {
			temp += String.format("%.2f ", current.getValue());
			current = current.getNode();
		}
		return temp;
	}
}
