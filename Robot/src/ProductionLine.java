import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ProductionLine {

	private Queue<Disk> input;
	private Queue<Tower> output;
	private Tower arm;

	public ProductionLine() {
		input = new LinkedList<Disk>();
		output = new LinkedList<Tower>();
		arm = new Tower();

	}

	public void addDisk(Disk d) {
		input.add(d);
	}

	public void unloadRobot() {
		arm.flip();
		output.add(arm);
		arm = new Tower();
	}

	public void process() {
		Queue<Disk> temp = new LinkedList<Disk>();
		while (!input.isEmpty()) { // while there's stuff in input
			Disk topDisk = input.remove(); // store the topValue and popItOffBoy
			if (!arm.isEmpty()) { // if the arm isn't empty
				// you compare the first disk of input and top of arm
				if (arm.peek().compareTo(topDisk) < 0) { // if topDisk rly the
															// top
					unloadRobot(); // no need to sort
				} else { // if topDisk aint the top, you need to sort
					temp.add(topDisk); //temp hold the topDisk value
					topDisk = arm.pop(); //new topDisk
 //TODO just need to keep comparing Disks until sorted
					while (!temp.isEmpty()) //not really sure what im doing here
						arm.push(temp.remove());
				}
			} else {
				arm.push(topDisk);
			}
		}
	}

	// *
	// ******
	//
	// ***
	// **
	// *

	public Tower removeTower() {
		Tower t = new Tower();
		if (!output.isEmpty()) {
			t = output.peek();
			output.remove(t);
		} else {
			t = null;
		}
		return t;
	}

	public String toString() {
		String res = "";
		for (Disk d : input) {
			String block = d.getRadius() + "";
			for (int i = 0; i < d.getRadius(); i++) {
				res += block + "|";
			}
			res += "\n";
		}
		return res + "\n";
	}

}
