import java.util.Stack;

public class Tower extends Stack<Disk>{

	private Disk topDisk;
	
	public Tower(){
		Disk d = new Disk(this.pop().getRadius());
		//or just this.pop()?
	}
	
	
}
