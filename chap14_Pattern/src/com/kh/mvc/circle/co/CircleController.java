package com.kh.mvc.circle.co;

import com.kh.mvc.circle.mo.CircleModel;
import com.kh.mvc.circle.vo.CircleView;

public class CircleController {

	private CircleModel model;
	private CircleView view;
	
	public CircleController(CircleModel model, CircleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		double userInput = view.getUserInput();
		
		model.setNumber(userInput);
		
		double result = model.Circle();
		view.displayResult(result);
		
		double result2 = model.Circle2();
		view.displayResult2(result2);
	}
}