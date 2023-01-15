
public abstract class BattleLoc extends Location {

	public BattleLoc(Player player) {
		super(player);
	}
 
    public void battle(Player player,Monster[] monster) {
    	boolean alive=true;
    	for(int i=0;i<monster.length;i++) {
    		
    	    while(player.getHealth()>0 && monster[i].getHealth()>0) {
    	    	
    	    	
    	    	monster[i].setHealth(monster[i].getHealth()-player.getDamage());
    	    	if(monster[i].getHealth()>0) {
    	    	player.setHealth(player.getHealth()-(monster[i].getDamage()-blockAbsorb(player,monster[i])));
    	    	}
    	    	
    	    }
    		
    	    if(player.getHealth()<=0) {
    	    System.out.println("YOU DIED GAME OVER!");
    	    alive=false;
    	    break;
    	    }
    	    if(monster[i].getHealth()<=0) {
    	    System.out.println("You killed "+(i+1)+"th monster\n"
    	    		+ "Your Health="+player.getHealth());	
    	    }
    	    
    	    
    	}	
    	if(alive && player.getInventory().isFood() && player.getInventory().isFirewood() && player.getInventory().isWater()) {
    		GameOver over = new GameOver();
    		alive = false;
    	}
    	
        if(alive) {
        	
        	player.setMoney(player.getMoney()+(monster.length*monster[0].getGold()));
        	System.out.println("Total Money ="+player.getMoney()+"\n");
        	location();
        	goLocation(player.selectRoad());
        	
        }
    	
    }
    
    public int blockAbsorb(Player player,Monster monster) {
    	
    	if(player.getBlock()>=monster.getDamage()) {
    		return monster.getDamage();
    	}
    	else
    		return player.getBlock();
    }


}
