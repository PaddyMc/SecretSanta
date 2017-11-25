package ss;

import java.util.ArrayList;

public class RunGame {
	static GameFacade gf = new GameFacade();
	static PlayerSorter ps = new PlayerSorter();
	static FileWriter fw = new FileWriter();

	public static void main(String[] args) {
		ArrayList<Player> playersInGame = new ArrayList<Player>();
		ArrayList<Player> playersWithSS = new ArrayList<Player>();
		
		gf.facade(playersInGame);
		
		ps.sortPlayers(playersInGame,playersWithSS);
		fw.writeToFile(playersWithSS);
	}

}
