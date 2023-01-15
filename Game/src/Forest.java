
public class Forest extends BattleLoc {

	public Forest(Player player) {
		super(player);
		
		int count=Monster.monsterNumber();
		System.out.println("You are in forest now...Be Careful!");
		System.out.println("There is "+count+" vampire.Do you want to fight? -y 1 -n 2");
		
		
		
		if(player.selectRoad()==1) {
			
			Vampire vampire = new Vampire();
			
			
			Monster[] vampires = new Monster[count];
			for(int i=0;i<vampires.length;i++) {
				vampires[i] = new Monster();
				vampires[i].setHealth(vampire.getVampireHealth());
				vampires[i].setDamage(vampire.getVampireDamage());
				vampires[i].setGold(vampire.getVampireGold());
			}
	
			player.getInventory().setFirewood(true);
			battle(player,vampires);
		}
		else {
			Forest forest = new Forest(player);
		}
		
	}



}


