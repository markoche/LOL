package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import makoche.entity.Heros;
import markoche.service.HeroService;

public class Ttest {

	public static void main(String[] args) {
		String []p={"spring-bean.xml","spring-common.xml"};
		ApplicationContext context=new ClassPathXmlApplicationContext(p);
		HeroService hs=(HeroService) context.getBean("heroservice");
		Heros heros=new Heros();
		heros.setId(130);
		heros.setName("猪八戒");
		hs.updateHero(heros);
	}
	
}
