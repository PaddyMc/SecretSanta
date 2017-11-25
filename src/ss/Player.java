package ss;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Player {
	String name;
	Player player;
	boolean isTaken;
	
	Player(String name){
		this.name = name;
		this.isTaken = false;
	}
	
	public void addPlayer(Player player){
		this.player = player;
	}
	
	public void take(){
		this.isTaken = true;
	}
	
	public void writeToFile() throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer = new PrintWriter(this.name + ".txt", "UTF-8");
		writer.println(this.player.name);
		writer.close();
	}
}
