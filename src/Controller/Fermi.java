package Controller;

import java.util.HashMap;
import java.util.Random;

import javax.swing.JTextArea;

public class Fermi {
	
	public static final String FERMI = "Fermi";
	public static final String PICO = "Pico";
	public static final String NANO = "Nano";
	
	
	public HashMap<String, Integer> GenerateRandom(HashMap<String, Integer> game) {
		Random r = new Random();
		int i; 
		int upperBound = 10;
		i = r.nextInt(upperBound);
		game.put("A", i);
		while (true) {
			i = r.nextInt(upperBound);
			if(!game.containsValue(i)) {
				game.put("B", i);
				break;
			}
		}
		while (true) {
			i = r.nextInt(upperBound);
			if(!game.containsValue(i)) {
				game.put("C", i);
				break;
			}
		}	
		return game;
	}
	
	public void CheckNumbers(JTextArea exit,Integer value1,Integer value2,Integer value3,HashMap<String, Integer> game) {
		StringBuilder str = new StringBuilder();

		str.append("" + value1 + " " + value2 + " " + value3 + " : ");
		String resultA = Comparator(value1, game, "A");
		String resultB = Comparator(value2, game, "B");
		String resultC = Comparator(value3, game, "C");
		
		str.append(resultA + " ");
		str.append(resultB+ " ");
		str.append(resultC+ " ");
		str.append("\n");
		
		if(resultA.equals(FERMI) && resultB.equals(FERMI) && resultC.equals(FERMI)) {
			str.append("Congratulations! Guesses: "+ returnAttempts(exit.getText().concat(str.toString())));
		}
		exit.setText(exit.getText().concat(str.toString()));
	}
	
	private String Comparator(Integer input, HashMap<String, Integer> game,String posicao) {
		if (game.containsValue((input))) {
			if(game.get(posicao).equals(input)) {
				return FERMI;
			}else {
				return PICO;
			}
		}
		return NANO;
	}
	
	private Integer returnAttempts(String str) {
		String[] qtyLine = str.split("\n");
		return qtyLine.length;
	}

	
}
