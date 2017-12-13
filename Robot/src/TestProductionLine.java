
public class TestProductionLine {

	public static void main(String[] args) {
		Disk test1 = new Disk(1);
		Disk test11 = new Disk(11);
		Disk test10 = new Disk(10);

		ProductionLine p = new ProductionLine(); 
		p.addDisk(test1);
		p.addDisk(test11);
		p.addDisk(test10);
		
		System.out.println(p.printInput());
		p.process();
		System.out.println(p.printOutput());
		
		//negative, positive, equal comapreTo
		
		//use compareTo
		
		//flip()
		
		//

	}

}
