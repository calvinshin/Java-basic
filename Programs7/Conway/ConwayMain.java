import java.util.*;

public class ConwayMain {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ConwayWorld world = new ConwayWorld();
		
		// Add some live conway cells, in a horizontal line		
		for (int i = 0; i < 3; i++) {
			MultiStateCell c = new MultiStateCell(10, 10 + i, world);
			c.setIsAlive(true);
			world.replaceCell(c);
		}

//		Add a blinker cell
		AbstractCell b = new BlinkerCell(15, 15, world);
		world.replaceCell(b);

//		// Add an always-alive cells
//		AbstractCell a = new AlwaysAliveCell(12, 12, world);
//		world.replaceCell(a);
//
//		// Add an never-alive cells
//		AbstractCell n = new NeverAliveCell(17, 17, world);
//		world.replaceCell(n);
			
		// Go!	
		do {
			world.display();
			world.advanceToNextGeneration();
			
			System.out.print("Another? (y/n): ");
		} while (input.nextLine().charAt(0) == 'y');
	}
}