/**
 * <h1>Tower</h1> A Stack of Disks.
 * <br/><br/>
 * @author Gabby Baniqued
 */

import java.util.Stack;

public class Tower extends Stack<Disk> {

	/**
	 * Default Constructor for Tower.
	 */
	public Tower() {
		super();
	}

	/**
	 * Adds Disk to Tower.
	 * @param d to be added.
	 */
	public void addDisk(Disk d) {
		this.push(d);
	}

	/**
	 * Flips tower.
	 */
	public void flip() {
		Stack<Disk> flippedStack = new Stack<Disk>();

		//pushes from Stack to arm
		while (!this.isEmpty()) {
			flippedStack.push(this.pop());
		}
		
		//pushes from Tower to Stack
		while (!flippedStack.isEmpty()) {
			this.push(flippedStack.pop());
		}

	}

	/**
	 * Overrides toString method, prints each individual Tower.
	 * @return printed Tower.
	 */
	public String toString() {
		String result = "{";
		while (!this.isEmpty()) {
			result += this.pop() + "|";
		}
		return result + "}";
	}

}
