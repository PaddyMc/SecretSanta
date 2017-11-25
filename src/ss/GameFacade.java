package ss;

import java.util.ArrayList;
import java.util.Scanner;

public class GameFacade {
	PlayerFactory pf = new PlayerFactory();
	
	public void facade(ArrayList<Player> playersInGame){
		Scanner reader = new Scanner(System.in);
		System.out.println("How many people are doing Secret Santa: ");
		int numberOfPeople = reader.nextInt();
		for(int i = 0;i<numberOfPeople;i++){
			System.out.println("Name of Person "+ i +": ");
			String name = reader.next();
			
			Player newPlayer = pf.createPlayer(name);
			playersInGame.add(newPlayer);
		}
		reader.close();
	}
}
