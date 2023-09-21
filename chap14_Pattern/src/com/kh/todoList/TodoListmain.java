package com.kh.todoList;
// *************문제 다시 풀어보기**********************************************************
public class TodoListmain {

	public static void main (String[] args) {
		TodoListModel tdmodel = new TodoListModel("아침 먹기!");
		TodoListView tdView = new TodoListView();
	
		System.out.println(tdmodel);
		String item = tdmodel.getItem();
		tdView.displayTodoList();
		
	}
}
