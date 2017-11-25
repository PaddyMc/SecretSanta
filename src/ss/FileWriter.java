package ss;

import java.util.ArrayList;

public class FileWriter {
	public void writeToFile(ArrayList<Player> playersInGame){
		for(Player player:playersInGame){
			try{
				player.writeToFile();
			}catch(Exception e){
				System.out.print("Error");
			}
		}
	}
}
