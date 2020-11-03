package com.blz.stack;

public class MyQueue<K> {

	private final MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode myNode) {
		myLinkedList.appendAfter(myNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public INode dequeue() {
		return myLinkedList.delete();
	}
}
