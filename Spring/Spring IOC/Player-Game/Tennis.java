package mypack;

import org.springframework.stereotype.Component;

@Component
public class Tennis implements Game {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play Tennis");
	}

}
