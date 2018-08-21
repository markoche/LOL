package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import makoche.entity.Heros;
import markoche.service.HeroService;

public class TestSSH extends TestCase {

	//查找
	public void testFind(){
		String []p={"spring-bean.xml","spring-common.xml"};
		ApplicationContext context=new ClassPathXmlApplicationContext(p);
		HeroService hs=(HeroService) context.getBean("heroservice");
		List<Heros> list=hs.getHero();
		System.out.println(list);
	}
	//分页查找
		public void testFind2(){
			String []p={"spring-bean.xml","spring-common.xml"};
			ApplicationContext context=new ClassPathXmlApplicationContext(p);
			HeroService hs=(HeroService) context.getBean("heroservice");
			List<Heros> list=hs.divide(2, 10);
			System.out.println(list);
		}
	//增加
//	public void testAdd(){
//		String []p={"spring-bean.xml","spring-common.xml"};
//		ApplicationContext context=new ClassPathXmlApplicationContext(p);
//		HeroService hs=(HeroService) context.getBean("heroservice");
//		Heros h=new Heros();
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		Date curr;
//		try {
//			curr = formatter.parse("2001-02-05");
//			h.setBirthday(curr);
//			h.setE("e");
//			h.setFirst("q");
//			h.setImg("hello.jpg");
//			h.setName("悟空");
//			h.setNickname("猴子");
//			h.setPassivity("回血");
//			h.setQ("1");
//			h.setR("r");
//			h.setSecond("战士");
//			h.setSex("男");
//			h.setW("w");
//			
//			hs.addHero(h);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//}
	    //删除
		public void testdel(){
			String []p={"spring-bean.xml","spring-common.xml"};
			ApplicationContext context=new ClassPathXmlApplicationContext(p);
			HeroService hs=(HeroService) context.getBean("heroservice");
			Heros heros=hs.getH(131);
			hs.delHero(heros);
			
		}
		//修改
		public void testUpdate(){
			String []p={"spring-bean.xml","spring-common.xml"};
			ApplicationContext context=new ClassPathXmlApplicationContext(p);
			HeroService hs=(HeroService) context.getBean("heroservice");
			Heros heros=hs.getH(130);
			heros.setName("猪八戒");
			hs.updateHero(heros);
		}
		//查总条数
		public void testFind3(){
			String []p={"spring-bean.xml","spring-common.xml"};
			ApplicationContext context=new ClassPathXmlApplicationContext(p);
			HeroService hs=(HeroService) context.getBean("heroservice");
			int n=(int) hs.getCount();
			System.out.println("共有"+n);
		}
		//根据用户名查
				public void testFind4(){
					String []p={"spring-bean.xml","spring-common.xml"};
					ApplicationContext context=new ClassPathXmlApplicationContext(p);
					HeroService hs=(HeroService) context.getBean("heroservice");
				//	Heros heros=hs.getByName("探险家");
			//		System.out.println(heros);
				}
}
