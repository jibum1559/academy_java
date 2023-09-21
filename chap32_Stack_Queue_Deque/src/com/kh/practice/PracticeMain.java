package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	
	public static void main(String[] args) {
		// stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
		PracticeMain am = new PracticeMain();
	//	am.PracticeStack();
		am.PracticeQueue();
	}
	public void PracticeStack() {
		Stack<Integer> stack = new Stack<>();
		// stack 값 추가 push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// stack 값 삭제 pop()
		stack.pop();
		System.out.println(stack.pop()); 
		System.out.println(stack.pop()); 
		
		// stack 전체 값 제거 (초기화)
		stack.clear();
		System.out.println(); 
		
		// stack 가장 상단의 값 (가장 마지막에 넣은 값) 출력
		stack.peek();
		System.out.println(stack.peek()); 
		
		// stack 의 크기 출력
		stack.size();
		System.out.println(stack.size()); 
		
		// stack empty : 스택이 비어있는지 check
		// 비어있다면 true 하나라도 들어있다면 false
		stack.empty();
		System.out.println(stack.empty()); 
		
		// stack 1이 있는지 check 1이 존재한다면 true
		stack.contains(1);
		System.out.println(stack.contains(1)); 
	}

	public void PracticeQueue() {
		//큐에 요소 추가 반환 삭제하고 while 사용해보기
		Queue<String> queue = new LinkedList<>();
		queue.offer("키보드");
		queue.offer("모니터");
		queue.offer("마우스");
		
		String removedEl = queue.poll();
		System.out.println("요소 제거 후 반환 : " + removedEl);

		String frontEl = queue.peek();
		System.out.println("front 요소 확인 : " + frontEl);
		
		int size = queue.size();
		System.out.println(size);
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
			
		}
		
		
	}
}


