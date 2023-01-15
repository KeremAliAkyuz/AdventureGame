
public abstract class Location {

	private Player player;
	int location;
	
	public void location() {
		System.out.println("Places you can go->\n"
    			+ "1-Safe Home\n"
    			+ "2-Tool Store\n"
    			+ "3-Cave\n"
    			+ "4-Forest\n"
    			+ "5-River");
	}
	
	public void goLocation(int i) {
		if(i==1) {
			SafeHome home = new SafeHome(getPlayer());
		}
		if(i==2) {
			ToolStore store = new ToolStore(getPlayer());
		}
		if(i==3) {
			Cave cave = new Cave(getPlayer());
		}
		if(i==4) {
			Forest forest = new Forest(getPlayer());
		}
		if(i==5) {
			River river = new River(getPlayer());
		}
	}
	
	public Location(Player player) {
        this.player=player;
	}
	
	public void setPlayer(Player player) {
		this.player=player;
	}
	public Player getPlayer() {
		return player;
	}
}

