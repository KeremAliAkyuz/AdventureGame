
public class SafeHome extends Location {

	public SafeHome(Player player) {
		super(player);
		fullHealth();
		System.out.println("You are in your safe house right now...\n"
				+ "Your Health is FULL ("+player.getHealth()+")\n");
		location();
		goLocation(player.selectRoad());
		
		
	}

	
	public void fullHealth() {
		getPlayer().setHealth(getPlayer().getBaseHealth());
	}

}
