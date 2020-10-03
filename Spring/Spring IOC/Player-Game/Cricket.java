package mypack;

import org.springframework.stereotype.Component;

@Component(value="cricket")
public class Cricket implements Game {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play Cricket");
	}

}
