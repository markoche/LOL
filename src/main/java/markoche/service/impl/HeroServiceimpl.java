package markoche.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import makoche.dao.HeroDao;
import makoche.entity.Heros;
import markoche.service.HeroService;

public class HeroServiceimpl implements HeroService {

	HeroDao heroDao;
	
	public HeroDao getHeroDao() {
		return heroDao;
	}

	public void setHeroDao(HeroDao heroDao) {
		this.heroDao = heroDao;
	}
        //方法
	public int addHero(Heros heros) {
		// TODO Auto-generated method stub
		return heroDao.addHero(heros);
	}
        //删除
	public void delHero(Heros heros) {
		// TODO Auto-generated method stub
		
		 heroDao.delHero(heros);;
	}
        //修改
	public void updateHero(Heros heros) {
		// TODO Auto-generated method stub
		heroDao.updateHero(heros);
	}
      //查询
	public List<Heros> getHero() {
		// TODO Auto-generated method stub
		return heroDao.getHero();
	}

	public List<Heros> divide(int page, int size) {
		// TODO Auto-generated method stub
		return heroDao.divide(page, size);
	}

	public Heros getH(int id) {
		// TODO Auto-generated method stub
		return heroDao.getH(id);
	}

	public long getCount() {
		// TODO Auto-generated method stub
		return heroDao.getCount();
	}

	public List<Heros> getByName(String name) {
		// TODO Auto-generated method stub
		return heroDao.getByName(name);
	}

}
