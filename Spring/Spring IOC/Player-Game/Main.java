package mypack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf=new ClassPathXmlApplicationContext("inject.xml");
		Player p1=(Player)bf.getBean("player");
		p1.perform();
	}

}
