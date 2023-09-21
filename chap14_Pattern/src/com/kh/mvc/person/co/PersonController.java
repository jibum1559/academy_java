package com.kh.mvc.person.co;

import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonController {
	
	private PersonView view;
	
	private PersonModel model;

	public PersonController(PersonModel model, PersonView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {

		String userInput = view.getUserInput();
		
		model.setName(userInput);
		
		String result = model.name();
		view.displayResult(result);
	}
}