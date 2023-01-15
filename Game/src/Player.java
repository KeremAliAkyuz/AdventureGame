import java.util.Scanner;

public class Player {


	private int health;
	private int damage;
	private int money;
	private int baseHealth;
	private int baseDamage;
	private int block;
	private Inventory inventory = new Inventory();
	
	Player(int id){
		

		if(id==1) {
		    damage=5;
		    setBaseDamage(5);
		    health=21;
		    money=15;
		    baseHealth=121;
		    block=0;
		    System.out.println("You Choose Samurai!");
		}
		if(id==2) {
		    damage=7;
		    setBaseDamage(7);
		    health=18;
		    money=20;
		    baseHealth=18;
		    block=0;
		    System.out.println("You Choose Archer!");
			}
		if(id==3) {
		    damage=8;
		    setBaseDamage(8);
			health=24;
			money=5;
			baseHealth=24;
			block=0;
			System.out.println("You Choose Knight!");
			}
		
		System.out.println("Welcome to the game!\n");
				
	}
	
	

	public int selectRoad() {
		
		 Scanner scanner = new Scanner(System.in);
		 int choose = scanner.nextInt();
		 return choose;
		 
	}
	
	
		
	
	
	public void setHealth(int newHealth) {
		   health=newHealth;
	   }
	public int getHealth() {
		  return health;
	}
	public void setDamage(int newDamage) {
		   damage=newDamage;
	   }
	public int getDamage() {
		  return damage;
	}
	
	public void setMoney(int newMoney) {
		   money=newMoney;
	   }
	public int getMoney() {
		  return money;
	}
    public void setBaseHealth(int newBaseHealth) {
    	  baseHealth=newBaseHealth;
    }

    public int getBaseHealth() {
    	  return baseHealth;
    }
    public void setBlock(int newBlock) {
    	block=newBlock;
    }
    public int getBlock() {
    	return block;
    }

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
    

}
   
   