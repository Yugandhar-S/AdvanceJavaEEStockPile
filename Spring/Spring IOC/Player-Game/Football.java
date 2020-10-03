package mypack;

import org.springframework.stereotype.Component;

@Component(value="football")
public class Football implements Game {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play football");
	}

}
