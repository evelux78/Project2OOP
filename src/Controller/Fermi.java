package Controller;

import java.util.Random;
import java.util.Vector;

import javax.swing.JTextArea;

public class Fermi {
	
	public static final String FERMI = "Fermi";
	public static final String PICO = "Pico";
	public static final String NANO = "Nano";
	
	
	public Vector<Integer> GenerateRandom(Vector<Integer> game) {
		Random r = new Random();
		int i; 
		int upperBound = 10;
		i = r.nextInt(upperBound);
		game.add(i);
		while (true) {
			i = r.nextInt(upperBound);
			if(!game.contains(i)) {
				game.add(i);
				break;
			}
		}
		while (true) {
			i = r.nextInt(upperBound);
			if(!game.contains(i)) {
				game.add(i);
				break;
			}
		}	
		return game;
	}
	
	public void CheckNumbers(JTextArea exit,Integer value1,Integer value2,Integer value3,Vector<Integer> game) {
		StringBuilder str = new StringBuilder();
		str.append(Comparator(value1, game, 0));
		str.append(Comparator(value2, game, 0));
		str.append(Comparator(value3, game, 0));
		
		exit.setText(str.toString());
	}
	
	private String Comparator(Integer input, Vector<Integer> game,Integer position) {
		if (game.contains(input)) {
			if(game.get(position) == input) {
				return FERMI;
			}else {
				return PICO;
			}
		}
		return NANO;
	}
}
