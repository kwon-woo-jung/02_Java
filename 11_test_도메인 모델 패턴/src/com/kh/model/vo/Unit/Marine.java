package Unit;
//가장 기본 : 마린
public class Marine extends TerranUnit{
	
	//마린의 생산자. 마린을 생산할때는 50,0,1 만큼의 자원을 필요로 하고싶은데, 어떻게 해야 될까
	public Marine(int price_mineral, int price_gas, int making_time) {
		super(price_mineral, price_gas, making_time);
	}
	private int hp;		//체력
	private int dmg;	//공격력
	private int def;	//방어력
//  private char s;		//소형		//일단 크기는 구현하지 말자...공격계산식에 사용되는 변수지만 공격메서드를 만들 수 있을지에 대한 확신이 아직은 없다.
	private int price_mineral = 50;
	private int price_gas = 0;
	private int price_population = 1;
	private int making_time = 15;
	
	//체력,공격력,방어력,생산미네랄,생산가스,생산인구,만드는시간 대한 Getter&Setter (이걸 메서드 하나로 만들면 좋을것같은데..)
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}	
	public int getPrice_mineral() {
		return price_mineral;
	}
	public void setPrice_mineral(int price_mineral) {
		this.price_mineral = price_mineral;
	}
	public int getPrice_gas() {
		return price_gas;
	}
	public void setPrice_gas(int price_gas) {
		this.price_gas = price_gas;
	}
	public int getPrice_population() {
		return price_population;
	}
	public void setPrice_population(int price_population) {
		this.price_population = price_population;
	}
	public int getMaking_time() {
		return making_time;
	}
	public void setMaking_time(int making_time) {
		this.making_time = making_time;
	}
	
	
}