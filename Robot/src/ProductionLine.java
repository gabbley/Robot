import java.util.Queue;

public class ProductionLine {
	
	private Queue<Disk> input;
	private Queue<Tower> output;
	private Tower arm;

	public ProductionLine(){
		input = new Queue<Disk>();
		output = new Queue<Disk>();
		//smh this doesnt work boiiiiii
		//linkedlist?
				
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
		//arm.remove()
	}
	
}
