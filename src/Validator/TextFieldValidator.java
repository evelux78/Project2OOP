package Validator;

import java.awt.Color;
import java.util.List;

import javax.swing.JTextField;

public class TextFieldValidator {

	private String regExp = "\\w";
	private Color errorColor = Color.RED;
	private Boolean isErros = false;

	public void textFieldValidator(JTextField myTarget, Color myErrorColor) {
		try {
			if (myTarget.getText().length() != 1 && !myTarget.getText().matches(regExp)) {
				myTarget.setForeground(myErrorColor);
			}
		} catch (NullPointerException e) {
			myTarget.setForeground(myErrorColor);
		}
	}

	public void textFieldValidator(JTextField myTarget) {
		textFieldValidator(myTarget, errorColor);
	}

	public void setRegExp(String myRegExp) {
		this.regExp = myRegExp;
	}

	public void setErrorColor(Color myColor) {
		this.errorColor = myColor;
	}
	
	public void verifyAll(List<JTextField> listFilds) {
		for (JTextField fild : listFilds) {
			if(!fild.getForeground().equals(Color.BLACK)) {
				setIsErros(true);
			}
		}
	}
	
	public void setIsErros(Boolean isErros) {
		this.isErros = isErros;
	}
	
	public Boolean check() {
		return isErros;
	}

	public void reset() {
		errorColor = Color.RED;
		regExp = "\\w";
	}
}
