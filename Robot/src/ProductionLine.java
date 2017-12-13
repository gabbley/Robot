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
		for (Disk d : input) {
			while (!input.isEmpty()) {
				Disk topDisk = input.peek();
				if (arm.isEmpty()) {
					topDisk = input.remove();
					arm.push(topDisk);
				} else if (arm.peek().compareTo(topDisk) < 0) {
					arm.push(topDisk);
					
				}
			}
		}
	}
	
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
			for (int i = 0; i < d.getRadius(); i++) {
				res += "*";
			}
			res += "\n";
		}
		return res + "\n";
	}

}
