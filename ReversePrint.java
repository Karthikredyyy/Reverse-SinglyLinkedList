import java.util.*;

class SLLNode {
	int data;
	SLLNode next;

	SLLNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class ReversePrint {

	static void reversePrint(SLLNode head) {
		if (head == null) {
			return;
		}

		Stack<Integer> stack = new Stack<>();
		SLLNode current = head;

		while (current != null) {
			stack.push(current.data);
			current = current.next;
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	static SLLNode buildLinkedList(int[] values) {
		if (values.length == 0) {
			return null;
		}

		SLLNode head = new SLLNode(values[0]);
		SLLNode current = head;

		for (int i = 1; i < values.length; i++) {
			current.next = new SLLNode(values[i]);
			current = current.next;
		}

		return head;
	}

	public static void main(String[] args) {
	    System.out.print("Enter the number of test cases:");
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] values = new int[n];

			for (int j = 0; j < n; j++) {
				values[j] = scanner.nextInt();
			}

			SLLNode head = buildLinkedList(values);
			reversePrint(head);
		}

		scanner.close();
	}
}