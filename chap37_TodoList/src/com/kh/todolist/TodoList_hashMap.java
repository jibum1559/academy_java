package com.kh.todolist;
//hash문 
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList_hashMap {
	
	private ArrayList<String> tasks;
	
	public TodoList_hashMap() {
		tasks = new ArrayList<>();
		
	}

	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void removetask(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("잘못된 인덱스입니다.");
		}
	}
	
	public void displayTasks() {
		System.out.println("my TodoList");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + "." + tasks.get(i));
		}
	} 
	
	public static void main(String[] args) {
		TodoList_hashMap todoList = new TodoList_hashMap();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("할일 추가:add, 삭제:remove, 할일 보기:list, 종료:exit 입력하세요.");
			
			String choice = sc.nextLine();
			//문제. 할일추가해보기
			if(choice.equalsIgnoreCase("add")) {   /*힌트.문자가 대문자 소문자인지 상관하지 않고 보겠다 */
				System.out.println("할 일을 입력하세요.");
				String task = sc.nextLine();
				todoList.addTask(task);
				//힌트. equalsIgnoreCase
			} else if (choice.equals("remove") || choice.equals("REMOVE")) { /*힌트.또는 choice.equals("REMOVE") 사용 */
				System.out.println("삭제할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removetask(index);
				}catch (Exception e){
					System.out.println("유효하지 않은 입력입니다.");
				}
			} else if(choice.equals("list")) {
				todoList.displayTasks();
			} else if(choice.equals("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("어플리케이션 종료");
		sc.close();
	}

}
