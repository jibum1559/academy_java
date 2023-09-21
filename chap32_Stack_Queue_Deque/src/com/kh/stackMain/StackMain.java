package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// stack �� �߰� push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// stack �� ���� pop()
		stack.pop();
		System.out.println(stack.pop()); //3
		
		// stack ��ü �� ���� (�ʱ�ȭ)
		stack.clear();
		System.out.println(); //3
		
		// stack ���� ����� �� (���� �������� ���� ��) ���
		stack.peek();
		System.out.println(stack.peek()); //3
		
		// stack �� ũ�� ���
		stack.size();
		System.out.println(stack.size()); //3
		
		// stack empty : ������ ����ִ��� check
		// ����ִٸ� true �ϳ��� ����ִٸ� false
		stack.empty();
		System.out.println(stack.empty()); //3
		
		// stack 1�� �ִ��� check 1�� �����Ѵٸ� true
		stack.contains(1);
		System.out.println(stack.contains(1)); //3
		/*
		 * |	 |
		 * |  3	 |
		 * |  2	 |
		 * |__1__|
		 */
		System.out.println(stack.pop()); //3
		System.out.println(stack.pop()); //2
	}

}
