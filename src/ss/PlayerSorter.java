package ss;
import java.util.ArrayList;

public class PlayerSorter {
	public void sortPlayers(ArrayList<Player> playersInGame, ArrayList<Player> playersWithSS){
		Player playerWithoutGifter = null; 
		for(Player player : playersInGame){
			playerWithoutGifter = sort(player, playersInGame);
			player.addPlayer(playerWithoutGifter);
			playersWithSS.add(playerWithoutGifter);
		}
		playersInGame.remove(playerWithoutGifter);
	}
	
	public Player sort(Player player, ArrayList<Player> playersInGame){
		int random = (int)(Math.random() * playersInGame.size()+1);
		
		if(playersInGame.get(random-1).isTaken || playersInGame.get(random-1).name == player.name){
			return sort(player, playersInGame);
		}else{
			Player p = playersInGame.get(random-1);
			p.take();
			return p;
		}
	}
	
	public Player sort2(Player player, ArrayList<Player> playersInGame){
		while(true){
			int random = (int)(Math.random() * playersInGame.size()+1);
			if(!playersInGame.get(random-1).isTaken && playersInGame.get(random-1).name != player.name){
				Player p = playersInGame.get(random-1);
				p.take();
				return p;
			}
		}	
	}
}
