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
		Stack<Disk> flippedStack = new Stack<Disk>();

		// if robot's arm is empty
		while (!arm.isEmpty()) { 
			flippedStack.push(arm.pop());
		}

		while (!flippedStack.isEmpty()) {
			arm.push(flippedStack.pop());
		}
		
		output.add(arm);
		arm = new Tower();
	}

	public void process() {
		while (!input.isEmpty()) {
			Disk d = input.peek();
			input.remove(d);
			arm.push(d);
		}
	}

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

}
