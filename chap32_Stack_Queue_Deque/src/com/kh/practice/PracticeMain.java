package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	
	public static void main(String[] args) {
		// stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
		PracticeMain am = new PracticeMain();
	//	am.PracticeStack();
		am.PracticeQueue();
	}
	public void PracticeStack() {
		Stack<Integer> stack = new Stack<>();
		// stack �� �߰� push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// stack �� ���� pop()
		stack.pop();
		System.out.println(stack.pop()); 
		System.out.println(stack.pop()); 
		
		// stack ��ü �� ���� (�ʱ�ȭ)
		stack.clear();
		System.out.println(); 
		
		// stack ���� ����� �� (���� �������� ���� ��) ���
		stack.peek();
		System.out.println(stack.peek()); 
		
		// stack �� ũ�� ���
		stack.size();
		System.out.println(stack.size()); 
		
		// stack empty : ������ ����ִ��� check
		// ����ִٸ� true �ϳ��� ����ִٸ� false
		stack.empty();
		System.out.println(stack.empty()); 
		
		// stack 1�� �ִ��� check 1�� �����Ѵٸ� true
		stack.contains(1);
		System.out.println(stack.contains(1)); 
	}

	public void PracticeQueue() {
		//ť�� ��� �߰� ��ȯ �����ϰ� while ����غ���
		Queue<String> queue = new LinkedList<>();
		queue.offer("Ű����");
		queue.offer("�����");
		queue.offer("���콺");
		
		String removedEl = queue.poll();
		System.out.println("��� ���� �� ��ȯ : " + removedEl);

		String frontEl = queue.peek();
		System.out.println("front ��� Ȯ�� : " + frontEl);
		
		int size = queue.size();
		System.out.println(size);
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
			
		}
		
		
	}
}


