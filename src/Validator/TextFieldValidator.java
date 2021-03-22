package Validator;

import java.awt.Color;
import java.util.List;

import javax.swing.JTextField;

public class TextFieldValidator {

	private String regExp = "\\w";
	private Color errorColor = Color.RED;
	private Boolean isError = false;

	// Check if the input has 1 digit and the regexp;
	public void textFieldValidator(JTextField myTarget, Color myErrorColor) {
		try {
			if (myTarget.getText().length() != 1 || !myTarget.getText().matches(regExp)) {
				myTarget.setForeground(myErrorColor);
			}
		} catch (NullPointerException e) {
			myTarget.setForeground(myErrorColor);
		}
	}
	// call the method textFieldValidator adding the default error color;
	public void textFieldValidator(JTextField myTarget) {
		textFieldValidator(myTarget, errorColor);
	}

	public void setRegExp(String myRegExp) {
		this.regExp = myRegExp;
	}

	public void setErrorColor(Color myColor) {
		this.errorColor = myColor;
	}
	// validate if there is an error in some of the fields;
	public void verifyAll(List<JTextField> listFilds) {
		for (JTextField fild : listFilds) {
			if(!fild.getForeground().equals(Color.BLACK)) {
				setIsError(true);
			}
		}
	}
	// check for errors in the fields;
	public void setIsError(Boolean isError) {
		this.isError = isError;
	}
	
	public Boolean check() {
		return isError;
	}

	public void reset() {
		errorColor = Color.RED;
		regExp = "\\w";
	}
}
