package makoche.entity;

import java.util.Date;

import org.springframework.context.annotation.Scope;

public class Heros {

	private int id;
	private String name;
	private String nickname;
	private String sex;
	private String first;
	private String second;
	private String q;
	private String w;
	private String e;
	private String r;
	private String passivity;
	private String img;
	private Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	public String getPassivity() {
		return passivity;
	}
	public void setPassivity(String passivity) {
		this.passivity = passivity;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Heros(int id, String name, String nickname, String sex, String first, String second, String q, String w,
			String e, String r, String passivity, String img, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.sex = sex;
		this.first = first;
		this.second = second;
		this.q = q;
		this.w = w;
		this.e = e;
		this.r = r;
		this.passivity = passivity;
		this.img = img;
		this.birthday = birthday;
	}
	public Heros() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Heros [id=" + id + ", name=" + name + ", nickname=" + nickname + ", sex=" + sex + ", first=" + first
				+ ", second=" + second + ", q=" + q + ", w=" + w + ", e=" + e + ", r=" + r + ", passivity=" + passivity
				+ ", img=" + img + ", birthday=" + birthday + "]\n";
	}
	
}
