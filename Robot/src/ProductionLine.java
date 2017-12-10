import java.util.LinkedList;
import java.util.Queue;

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
		while (!input.isEmpty()) {
			Disk d = input.peek();
			input.remove(d);
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
