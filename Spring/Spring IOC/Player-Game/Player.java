package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Player {

	Game game;

	public Game getGame() {
		return game;
	}
	
	@Autowired
	@Qualifier(value="cricket")
	public void setGame(Game game) {
		this.game = game;
	}
	
	public void perform() {
		game.play();
	}

	@Override
	public String toString() {
		return "Player [game=" + game + "]";
	}
	
	
}
