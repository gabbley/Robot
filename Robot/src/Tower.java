/**
 * <h1>Tower</h1>
 * <br/><br/>
 * @author Gabby Baniqued
 */

//ss//ss
import java.util.Stack;

public class Tower extends Stack<Disk> {

	public Tower() {
		super();
	}

	public void addDisk(Disk d) {
		this.push(d);
	}



	public void flip() {
		Stack<Disk> flippedStack = new Stack<Disk>();

		// if robot's arm is empty
		while (!this.isEmpty()) {
			flippedStack.push(this.pop());
		}

		while (!flippedStack.isEmpty()) {
			this.push(flippedStack.pop());
		}
		
	}

}
