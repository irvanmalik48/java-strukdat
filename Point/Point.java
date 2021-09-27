public class Point {

	private int x;
	private int y;

	//konstruktor default
	public Point() {
		this.x = -1;
		this.y = -1;
	}

	//konstruktor with value
	public Point(int newx, int newy) {
		this.x = newx;
		this.y = newy;
	}

	//getter / accessor method
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void set(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}

	//setter / mutator method
	public void setX(int newX) {
		this.x = newX;
	}

	public void setY(int newY) {
		this.y = newY;
	}

	//print
	public void cetakPoint() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}

	//print dengan override method toString dari kelas object

	@Override
	public String toString() {
		return ("(" + this.x + "," + this.y + ")");
	}

	public void mirrorAll() {
		this.x = -1 * this.x;
		this.y = -1 * this.y;
	}

	//other methods
	public void mirrorX() {
		this.x = -1 * this.x;
	}

	public void mirrorY() {
		this.y = -1 * this.y;
	}
}
