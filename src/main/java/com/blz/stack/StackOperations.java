package com.blz.stack;

public class StackOperations<K> {

	private final MyLinkedList myLinkedList;

	public StackOperations() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}
}
