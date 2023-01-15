
public class Cave extends BattleLoc {
	
	public Cave(Player player) {
		super(player);
		
		int count=Monster.monsterNumber();
		System.out.println("You are in cave now...Be Careful!");
		System.out.println("There is "+count+" zombie.Do you want to fight? -y 1 -n 2");
		
		
		
		if(player.selectRoad()==1) {
			
			Zombie zombie = new Zombie();
			
			
			Monster[] zombies = new Monster[count];
			for(int i=0;i<zombies.length;i++) {
				zombies[i] = new Monster();
				zombies[i].setHealth(zombie.getZombieHealth());
				zombies[i].setDamage(zombie.getZombieDamage());
				zombies[i].setGold(zombie.getZombieGold());
			}
	
			player.getInventory().setFood(true);
			battle(player,zombies);
			
		}
		else {
			Cave cave = new Cave(player);
		}
		
	}



}
