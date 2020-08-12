package com.lams1989.insnodtail;

public class AppInsNodTail {
	
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;

		public SinglyLinkedList() {
			this.head = null;
		}

	}

	public static void main(String args[]) {

		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 530, 474 };

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem[i]);
			llist.head = llist_head;
		}
		System.out.println(llist.head.data);
	}

	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);

		if (head == null) {
			head = nodeInsert;
		} else {
			SinglyLinkedListNode actual = head;
			while (nodeInsert != null) {
				if (actual.next == null) {
					actual.next = nodeInsert;
					nodeInsert = null;
				}
				actual = actual.next;
			}
		}
		return head;
	}
}
