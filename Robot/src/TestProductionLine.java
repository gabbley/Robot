
public class TestProductionLine {

	public static void main(String[] args) {
		Disk test5 = new Disk(5);
		Disk test1 = new Disk(1);
		Disk test11 = new Disk(11);
		Disk test9 = new Disk(9);
		//Disk test0 = new Disk(0);
		Disk test10 = new Disk(10);

		ProductionLine p = new ProductionLine();
		p.addDisk(test5);
		p.addDisk(test1);
		p.addDisk(test11);
		p.addDisk(test9);
		//p.addDisk(test0);
		p.addDisk(test10);
		
		System.out.println(p);
		
		p.process();
		
		System.out.println("Test Process:\n" + p);
		
		//negative, positive, equal comapreTo
		
		//use compareTo
		
		//flip()
		
		//

	}

}
