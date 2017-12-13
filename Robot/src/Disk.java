/**
 * <h1>Disk</h1>Disk with a given radius. 
 * <br/><br/>
 * @author Gabby Baniqued
 */

public class Disk implements Comparable<Disk> {
	
	//Field for radius of disk
	private int radius;
	
	/**
	 * Constructor for Disk
	 * @param radius of Disk
	 */
	public Disk(int r) {
		radius = r;
	}

	/**
	 * Getter for radius
	 * @return radius of Disk
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * Overrides compareTo method, compares given Disk to current Disk.
	 * @return indicating integer of the comparison
	 */
	@Override
	public int compareTo(Disk o) {
		return this.radius - o.radius;
	}

	/**
	 * Overrides toString, prints out radius.
	 * @return String of radius
	 */
	public String toString(){
		return radius + "";
	}
}

