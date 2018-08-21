package makoche.dao;

import java.util.List;

import makoche.entity.Heros;

public interface HeroDao {

	public int addHero(Heros heros);
	public void delHero(Heros heros);
	public void updateHero(Heros heros);
	public List<Heros> getHero();
	public List<Heros> divide(int page,int size);
	public Heros getH(int id);
	public long getCount();
	public List<Heros> getByName(String name);
}
