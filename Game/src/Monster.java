
public class Monster {

	private int health;
	private int damage;
	private int gold;
	
	Monster(){
			
	}
	
	public static int monsterNumber() {
		return (int)(Math.random()*(4-1+1)+1);  
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
}
