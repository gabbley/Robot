
public class Disk implements Comparable<Disk> {

	private int radius;

	public Disk(int r) {
		radius = r;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public int compareTo(Disk o) {
		return this.radius - o.radius;
	}

	public String toString(){
		return radius + "";
	}
}

