import java.util.LinkedList;
import java.util.Queue;

public class ProductionLine {
	
	private Queue<Disk> input;
	private Queue<Tower> output;
	private Tower arm;

	public ProductionLine(){
		input = new LinkedList<Disk>();
		output = new LinkedList<Tower>();
				
	}
	
	public void addDisk(Disk d){
		input.add(d);
	}
	
	public void unloadRobot(){
		arm.flip();
		output.add(arm);
	}
	
	public void process(){
		
	}
	
	public Disk removeTower(){
		
	}
	
}
