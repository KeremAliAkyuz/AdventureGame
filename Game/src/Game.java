import java.util.Scanner;

public class Game {

	public void start() {
		System.out.println("Choose your character!\n"
				+ "1-Samurai\n"
				+ "2-Archer\n"
				+ "3-Knight");
		
	    Scanner scanner = new Scanner(System.in);
	    int choose = scanner.nextInt();
	    Player player = new Player(choose);
	    
	    SafeHome home = new SafeHome(player);
	    
	    
	}
	
}
