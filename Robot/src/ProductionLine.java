/**
 * <h1>ProductionLine</h1>
 * <br/><br/>
 * @author Gabby Baniqued
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ProductionLine {


	//fields used in ProductionLine
	private Queue<Disk> input;
	private Queue<Tower> output;
	private Tower arm;

	/**
	 * Default Constructor
	 */
	public ProductionLine() {
		input = new LinkedList<Disk>();
		output = new LinkedList<Tower>();
		arm = new Tower();

	}

	/**
	 * Adds Disk to assembly line (input queue).
	 * @param Disk to be added to input
	 */
	public void addDisk(Disk d) {
		input.add(d);
	}

	/**
	 * Flips Disk pyramid in robot arm, adds Disks to output, then empties arm.
	 */
	public void unloadRobot() {
		arm.flip();
		output.add(arm);
		arm = new Tower(); // unloads the arm
	}

	/**
	 * Adds Disks from assembly line to robot arm. 
	 Flips the pyramid then adds to outgoing assembly line.
	 */
	public void process() {
		while (!input.isEmpty()) {
			Disk topDisk = input.remove();
			if (!arm.isEmpty()) {
				if (arm.peek().compareTo(topDisk) <= 0) {
					unloadRobot();
				}
			}
			arm.push(topDisk);
		}
		if (!arm.isEmpty()) {
			unloadRobot();
		}

	}

	/**
	 * Removes a Tower from the output Queue.
	 * @return Tower removed.
	 */
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

	/**
	 * Prints each Disk in input Queue.
	 * @return String of input Disks.
	 */
	public String printInput() {
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

	/**
	 * Prints each Tower of finished output Queue.
	 * @return String of finished Tower.
	 */
	public String printOutput() {
		String res = "";
		for (Tower t : output) {
			res += t.toString() + "\n";
		}
		return res;

	}


}
