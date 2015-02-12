package fixture;

import eg.triviaGameExample.Game;
import eg.triviaGameExample.Player;
import eg.triviaGameExample.fitnesseFixtures.StaticGame;

public class AddRemovePlayerFixture {
	private String playerName;
	private Game theGame;

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public boolean addPlayer() {
		theGame = StaticGame.theGame;
		Player thePlayer = theGame.addPlayer(playerName);
		return theGame.playerIsPlaying(thePlayer);
	}

	public int countPlayers() {
		return theGame.getNumberOfPlayers();
	}
} 