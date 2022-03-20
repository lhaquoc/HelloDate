package code.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Bowling {
	HashMap<String, Integer> players;

	Bowling() {
		players = new HashMap<>();
	}

	public void addPlayer(String name, int p) {
		players.put(name, p);
	}

	// your code goes here
	int max = 0;

	public void getWinner() {
		for (Map.Entry<String, Integer> i : players.entrySet()) {
			if (i.getValue() > max)
				max = i.getValue();
		}
		for (Map.Entry<String, Integer> i : players.entrySet()) {
			if(Objects.equals(max, i.getValue())) {
				System.out.println(i.getKey());
			}
		}
	}
}

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bowling game = new Bowling();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String input = sc.nextLine();
			String[] values = input.split(" ");
			String name = values[0];
			int points = Integer.parseInt(values[1]);
			game.addPlayer(name, points);
		}
		game.getWinner();
	}
}
