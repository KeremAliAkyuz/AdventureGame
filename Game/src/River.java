
public class River extends BattleLoc {
	
	public River(Player player) {
		super(player);
		
		int count=Monster.monsterNumber();
		System.out.println("You are in River now...Be Careful!");
		System.out.println("There is "+count+" bear.Do you want to fight? -y 1 -n 2");
		
		
		
		if(player.selectRoad()==1) {
			
			Bear bear = new Bear();
			
			
			Monster[] bears = new Monster[count];
			for(int i=0;i<bears.length;i++) {
				bears[i] = new Monster();
				bears[i].setHealth(bear.getBearHealth());
				bears[i].setDamage(bear.getBearDamage());
				bears[i].setGold(bear.getBearGold());
			}
	
			player.getInventory().setWater(true);
			battle(player,bears);
		}
		else {
			River river = new River(player);
		}
		
	}
}
