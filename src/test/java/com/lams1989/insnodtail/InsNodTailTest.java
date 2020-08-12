package com.lams1989.insnodtail;

import com.lams1989.insnodtail.AppInsNodTail.SinglyLinkedList;
import com.lams1989.insnodtail.AppInsNodTail.SinglyLinkedListNode;

import junit.framework.TestCase;

public class InsNodTailTest extends TestCase {

	public void testInsertNodeAtTail() {
		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 530, 474 };

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = AppInsNodTail.insertNodeAtTail(llist.head, llistItem[i]);
			llist.head = llist_head;
		}
		int expected =141;
		int actual = llist.head.data;
		
		assertEquals(expected, actual);

	}
	
	public void testInsertNodetail2() {
		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141 };

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = AppInsNodTail.insertNodeAtTail(llist.head, llistItem[i]);
			llist.head = llist_head;
		}
		int expected =141;
		int actual = llist.head.data;
		
		assertEquals(expected, actual);

	}
	public void testInsertNodetail3() {
		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = {123,123};

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = AppInsNodTail.insertNodeAtTail(llist.head, llistItem[i]);
			llist.head = llist_head;
		}
		int expected = 123;
		int actual = llist.head.data;
		
		assertEquals(expected, actual);

	}
}
