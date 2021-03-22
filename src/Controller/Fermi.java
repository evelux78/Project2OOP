package Controller;

import java.util.HashMap;
import java.util.Random;

import javax.swing.JTextArea;

public class Fermi {

	public static final String FERMI = "Fermi";
	public static final String PICO = "Pico";
	public static final String NANO = "Nano";

	// method to create 3 random numbers and add them to the hashmap
	public HashMap<String, Integer> GenerateRandom(HashMap<String, Integer> game) {
		Random random = new Random();
		int ramdomNumber;
		int upperBound = 10;
		ramdomNumber = random.nextInt(upperBound);
		game.put("A", ramdomNumber);
		
		// loop to generate numbers until they are different
		while (true) {
			ramdomNumber = random.nextInt(upperBound);
			if (!game.containsValue(ramdomNumber)) {
				game.put("B", ramdomNumber);
				break;
			}
		}
		while (true) {
			ramdomNumber = random.nextInt(upperBound);
			if (!game.containsValue(ramdomNumber)) {
				game.put("C", ramdomNumber);
				break;
			}
		}
		return game;
	}
	// Check if the input numbers are the same of the game numbers and add output numbers in the screen
	public boolean CheckNumbers(JTextArea exit, Integer value1, Integer value2, Integer value3,
			HashMap<String, Integer> game) {
		boolean isTerminated = false;
		StringBuilder str = new StringBuilder();
		// checking the field result;
		String resultA = Comparator(value1, game, "A");
		String resultB = Comparator(value2, game, "B");
		String resultC = Comparator(value3, game, "C");
		// creating the output line
		str.append("" + value1 + " " + value2 + " " + value3 + " : ");
		str.append(resultA + " ");
		str.append(resultB + " ");
		str.append(resultC + " ");
		str.append("\n");
		
		// checking if all inputs are correct;
		if (resultA.equals(FERMI) && resultB.equals(FERMI) && resultC.equals(FERMI)) {
			str.append("Congratulations! Guesses: " + returntentatives(exit.getText().concat(str.toString())));
			isTerminated = true;
		}
		exit.setText(exit.getText().concat(str.toString()));
		return isTerminated;
	}

	// Comparing input number and game number;
	private String Comparator(Integer input, HashMap<String, Integer> game, String position) {
		// check if the hashmap contains the value;
		if (game.containsValue((input))) {
			// check if the position and value are the same
			if (game.get(position).equals(input)) {
				return FERMI;
			} else {
				return PICO;
			}
		}
		return NANO;
	}
	
	//counting the number of lines to use as number of guesses
	private Integer returntentatives(String str) {
		String[] qtyLine = str.split("\n");
		return qtyLine.length;
	}

	// Method to show the random numbers for testing;
	public void setValueFermi(JTextArea resultTextArea, HashMap<String, Integer> game) {
		// the hashmap "get" method brings the associated key;
		resultTextArea.setText("The random numbers are: " + game.get("A") + " " + game.get("B") + " " + game.get("C"));
	}

}
