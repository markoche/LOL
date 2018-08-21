package makoche.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import makoche.dao.HeroDao;
import makoche.entity.Heros;

public class HeroDaoimpl extends HibernateSupport implements HeroDao {

	public int addHero(Heros heros) {
		// TODO Auto-generated method stub
		int n=(Integer) this.getHibernateTemplate().save(heros);
		return n;
	}
	
	public void delHero(Heros heros) {
		// TODO Auto-generated method stub
		Heros heros2=this.getHibernateTemplate().get(Heros.class, heros.getId());
		this.getHibernateTemplate().delete(heros2);
	}

	public void updateHero(Heros heros) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(heros);
	}
	public List<Heros> getHero() {
		// TODO Auto-generated method stub
		return (List<Heros>) this.getHibernateTemplate().find("from Heros");
	}

	public List<Heros> divide(final int page, final int size) {
		// TODO Auto-generated method stub
		List<Heros> list=this.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query q=session.createQuery("from Heros");
				q.setFirstResult((page-1)* size);
				q.setMaxResults(size);
				return q.list();
			}
		});
		return list;		
	}
	//根据id查找
	public Heros getH(int id) {
		// TODO Auto-generated method stub
		return (Heros) this.getHibernateTemplate().get(Heros.class, id);
	}
    //根据name查找
	public List<Heros> getByName(final String name) {
	
			// TODO Auto-generated method stub
			List<Heros> list=this.getHibernateTemplate().execute(new HibernateCallback() {

				public Object doInHibernate(Session session) throws HibernateException, SQLException {
					// TODO Auto-generated method stub
					Query q=session.createQuery("from Heros where name=?");
				    q.setParameter(0, name);
					return q.list();
				}
			});
			return list;		
		}
	
	public long getCount() {
		return (Long) this.getHibernateTemplate().find("select count(*) from Heros").iterator().next();
		
	}

}
