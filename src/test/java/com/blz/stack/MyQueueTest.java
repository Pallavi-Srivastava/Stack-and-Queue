package com.blz.stack;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

	// UC1 TestCase
	@Test
	public void added_3Numbers() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		INode peak = queue.peak();
		Assert.assertEquals(myFirstNode, peak);
	}

}
