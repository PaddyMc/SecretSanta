package ss;

public class PlayerFactory {
	public Player createPlayer(String name){
		Player newPlayer = new Player(name);
		return newPlayer;
	}
}
