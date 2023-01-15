
public class ToolStore extends Location{

	public ToolStore(Player player) {
		super(player);
		System.out.println("Welcome to Tool Store!\n"
				+ "Money:"+getPlayer().getMoney()+"\n"
				+ "1-Buy armor\n"
				+ "2-Buy weapon\n"
				+ "3-Go another place");
		int location = getPlayer().selectRoad();
		
		if(location==1) {
			armors();
		}
		else if(location==2) {
			weapons();
		}
		else if(location==3) {
		   location();
		   goLocation(player.selectRoad());
		}
	}

	
    public void armors() {
    
    	System.out.println("Choose your armor!\n"
				+ "1 - LightArmor - BlockPoint->1 - 15gold\n"
				+ "2 - NormalArmor - BlockPoint->3 - 25gold\n"
				+ "3 - HeavyArmor - BlockPoint->5 - 40gold\n"
				+ "4 exit");
    	switch (getPlayer().selectRoad()) {
    	case 1:    	
    		if(getPlayer().getMoney()>=15 && !getPlayer().getInventory().getArmorName().equals("LightArmor")) {
    			getPlayer().setMoney(getPlayer().getMoney()-15);
    			getPlayer().setBlock(1);
    			getPlayer().getInventory().setArmorName("LightArmor");
    			System.out.println("You bought LightArmor , Enjoy it!");
    			System.out.println("Your money:"+getPlayer().getMoney());
    			armors();
    		}
    		
    		else {
    			System.out.println("You dont have enough money or you already have this item :(");
    			armors();
    			
    		}
    	break;	
    	case 2:	
    		if(getPlayer().getMoney()>=25 && !getPlayer().getInventory().getArmorName().equals("NormalArmor")) {
        		getPlayer().setMoney(getPlayer().getMoney()-25);
    			getPlayer().setBlock(3);
    			getPlayer().getInventory().setArmorName("NormalArmor");
        		System.out.println("You bought NormalArmor , Enjoy it!");
        		System.out.println("Your money:"+getPlayer().getMoney());
        		armors();
    		}
        	else {
        		System.out.println("You dont have enough money or you already have this item :(");
        		armors();
        		
        	}
    	break;	
        case 3:		
    		if(getPlayer().getMoney()>=40 && !getPlayer().getInventory().getArmorName().equals("HeavyArmor")) {
    			getPlayer().setMoney(getPlayer().getMoney()-40);
    			getPlayer().setBlock(5);
    			getPlayer().getInventory().setArmorName("HeavyArmor");
    			System.out.println("You bought HeavyArmor , Enjoy it!");
    			System.out.println("Your money:"+getPlayer().getMoney());
    			armors();
    			}
    		else {
    			System.out.println("You dont have enough money or you already have this item :(");
    			armors();
    			
    		}
    	break;	
        case 4:
        	ToolStore store = new ToolStore(getPlayer());
        break;
    }
    }
    public void weapons() {
    	
    	System.out.println("Choose your weapon!\n"
				+ "1 - ShortSword - Damage->2 - 25gold\n"
				+ "2 - NormalSword - Damage->3 - 35gold\n"
				+ "3 - LongSword - Damage->7 - 45gold\n"
				+ "4 - exit");
    	switch (getPlayer().selectRoad()) {
    	case 1:    	
    		if(getPlayer().getMoney()>=25 && !getPlayer().getInventory().getWeaponName().equals("ShortSword")) {
    			getPlayer().setMoney(getPlayer().getMoney()-25);
    			getPlayer().setDamage(getPlayer().getBaseDamage()+2);
    			getPlayer().getInventory().setWeaponName("ShortSword");
    			System.out.println("You bought ShortSword , Enjoy it!");
    			System.out.println("Your money:"+getPlayer().getMoney());
    			weapons();
    		}
    		
    		else {
    			System.out.println("You dont have enough money or you already have this item :(");
    			weapons();
    			
    		}
    	break;	
    	case 2:	
    		if(getPlayer().getMoney()>=35 && !getPlayer().getInventory().getWeaponName().equals("NormalSword")) {
        		getPlayer().setMoney(getPlayer().getMoney()-35);
        		getPlayer().setDamage(getPlayer().getBaseDamage()+3);
        		getPlayer().getInventory().setWeaponName("NormalSword");
        		System.out.println("You bought NormalSword , Enjoy it!");
        		System.out.println("Your money:"+getPlayer().getMoney());
        		weapons();
    		}
        	else {
        		System.out.println("You dont have enough money or you already have this item :(");
        		weapons();
        		
        	}
    	break;	
        case 3:		
    		if(getPlayer().getMoney()>=45 && !getPlayer().getInventory().getWeaponName().equals("LongSword")) {
    			getPlayer().setMoney(getPlayer().getMoney()-45);
    			getPlayer().setDamage(getPlayer().getBaseDamage()+7);
    			getPlayer().getInventory().setWeaponName("LongSword");
    			System.out.println("You bought LongSword , Enjoy it!");
    			System.out.println("Your money:"+getPlayer().getMoney());
    			weapons();
    			}
    		else {
    			System.out.println("You dont have enough money or you already have this item :(");
    			weapons();
    			
    		}
    	break;	
        case 4:
        	ToolStore store = new ToolStore(getPlayer());
        break;	
    		
    	
    	}
    }
    
    
}
    