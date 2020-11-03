package com.blz.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackOperationTest {

	// UC1 TestCase
	@Test
	public void added_3Numbers() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		StackOperations<Integer> stack = new StackOperations<Integer>();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode peak = stack.peak();
		Assert.assertEquals(myThirdNode, peak);
	}

	// UC2 TestCase
	@Test
	public void delete_3Numbers() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		StackOperations<Integer> stack = new StackOperations<Integer>();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode pop = null;
		while (!stack.isEmpty()) {
			pop = stack.pop();
		}
		Assert.assertEquals(myFirstNode, pop);
	}
}
