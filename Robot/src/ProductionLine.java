import java.util.Queue;

public class ProductionLine {
	
	private Queue<Disk> input;
	private Queue<Tower> output;
	private Tower pyramid;

	public ProductionLine(){
		
	}
	
	public void addDisk(Disk d){
		input.add(d);
	}
	
	public void unloadRobot(){
		pyramid.flip();
	}
	
	public void process(){
		
	}
	
	public Disk removeTower(){
	
	}
	
}
