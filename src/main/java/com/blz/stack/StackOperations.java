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

	public INode pop() {
		return myLinkedList.delete();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return myLinkedList.isEmpty();
	}
}
