/**
 * <h1>TestProductionLine</h1>Class to test the methods of ProductionLine. <br/>
 * <br/>
 * 
 * @author Gabby Baniqued
 */
public class TestProductionLine {

	public static void main(String[] args) {

		// TEST 1 - Regular
		Disk test1 = new Disk(1);
		Disk test11 = new Disk(11);
		Disk test10 = new Disk(10);

		ProductionLine p = new ProductionLine();
		p.addDisk(test1);
		p.addDisk(test11);
		p.addDisk(test10);

		testProcess(p, "Initial Input Queue:", "Output Queue");

		// TEST 2 - Empty Queue
		// ProductionLine empty = new ProductionLine();
		// testProcess(empty, "Empty Input Queue", "Empty Output Queue");

		// TEST 3 - All the same radius
		ProductionLine same = new ProductionLine();

		for (int i = 0; i < 10; i++)
			same.addDisk(new Disk(5));

		testProcess(same, "Identical Disks", "Identical Disks");

		// TEST 4 - Random Radii
		ProductionLine rand = new ProductionLine();

		for (int i = 0; i < 10; i++)
			rand.addDisk(new Disk((int) (Math.random() * 10)));

		testProcess(rand, "Random Disks", "Random Disks");

		// TEST 5 - Remove Tower
		ProductionLine removing = new ProductionLine();

		for (int i = 0; i < 10; i++)
			removing.addDisk(new Disk((int) (Math.random() * 10)));

		removing.process();
		System.out.println("Tower Removed:" + removing.getOutput().removeTower());
		System.out.println("After Removing: \n" + removing.printOutput());

	}

	/**
	 * Prints input before running process, then prints output.
	 */
	public static void testProcess(ProductionLine p, String msg1, String msg2) {
		System.out.println(msg1 + " pre-process:\n" + p.printInput());
		p.process();
		System.out.println(msg2 + " post-process:\n" + p.printOutput());
	}

}
