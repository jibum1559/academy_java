package com.kh.todolist;
//hash�� 
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
			System.out.println("�߸��� �ε����Դϴ�.");
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
			System.out.println("���� �߰�:add, ����:remove, ���� ����:list, ����:exit �Է��ϼ���.");
			
			String choice = sc.nextLine();
			//����. �����߰��غ���
			if(choice.equalsIgnoreCase("add")) {   /*��Ʈ.���ڰ� �빮�� �ҹ������� ������� �ʰ� ���ڴ� */
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todoList.addTask(task);
				//��Ʈ. equalsIgnoreCase
			} else if (choice.equals("remove") || choice.equals("REMOVE")) { /*��Ʈ.�Ǵ� choice.equals("REMOVE") ��� */
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removetask(index);
				}catch (Exception e){
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			} else if(choice.equals("list")) {
				todoList.displayTasks();
			} else if(choice.equals("exit")) {
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		sc.close();
	}

}
