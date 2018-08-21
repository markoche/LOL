package markoche.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/*
 * action
 */

import makoche.entity.Heros;
import markoche.service.HeroService;
import markoche.service.impl.HeroServiceimpl;

public class HeroAction extends ActionSupport {

	HeroService heroService;
    Integer page;
    Heros heros;
    int id;
    String name;
    
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Heros getHeros() {
		return heros;
	}
	public void setHeros(Heros heros) {
		this.heros = heros;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public HeroService getHeroService() {
		return heroService;
	}
	public void setHeroService(HeroService heroService) {
		this.heroService = heroService;
	}
	//分页查看
	public String get(){
		int count=(int) heroService.getCount();
		int maxPage=count % 10==0 ?(count/10):(count/10+1);
		if(page==null){
			page=1;
		}
		
	List<Heros> list=heroService.divide(page, 10);
	System.out.println("大小"+list.size());
	Map map= (Map) ActionContext.getContext().get("request");
     map.put("hero", list);	
     map.put("page", page);
     map.put("maxPage", maxPage);
	return "success";
	}
	
		//分页查看
		public String getpage(){
			int count=(int) heroService.getCount();
			int maxPage=count % 10==0 ?(count/10):(count/10+1);
			if(page==null){
				page=1;
			}
			if(page<=1){
				page=1;
			}
			if(page>=maxPage){
				page=maxPage;
			}
		List<Heros> list=heroService.divide(page, 10);
		System.out.println("大小"+list.size());
		Map map= (Map) ActionContext.getContext().get("request");
	     map.put("hero", list);	
	     map.put("page", page);
	     map.put("maxPage", maxPage);
		return "success";
		}
	//添加
	public String add(){
		heros.setName(heros.getName());
		heros.setNickname(heros.getNickname());
		heros.setSex(heros.getSex());
		heroService.addHero(heros);
		return "add";
	}
	//删除
	public String del(){
		System.out.println("ooo"+id);
		Heros heros2=heroService.getH(id);
		heroService.delHero(heros2);
		return "del";
	}

	//修改
	public String update(){
		heroService.updateHero(heros);
		return "update";
	}
	//查找
		public String find(){
			System.out.println("hello");
			Heros heros=heroService.getH(id);
			System.out.println(heros);
			Map map= (Map) ActionContext.getContext().getSession();
		     map.put("heros", heros);
			return "cz";
		}

		//查找
				public String findName(){
					List<Heros> heros=heroService.getByName(name);
					System.out.println(heros);
					Map map= (Map) ActionContext.getContext().getSession();
				    map.put("hero", heros);
					return "findName";
				}
	
}
