public class Point {
    private int x;
    private int y;

    private boolean isValidY(int newy) {
        return newy >= 0;
    }

    // konstruktor default
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // konstruktor with value
    public Point(int newx, int newy) {
        this.x = newx;
        if (isValidY(newy)) {
            this.y = newy;
        } else {
            System.out.println("Nilai y yg dimasukkan tidak valid");
            this.y = 0;
        }
    }

    // getter / accessor method
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // setter / mutator method
    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newy) {
        if (isValidY(newy)) {
            this.y = newy;
        } else {
            System.out.println("Nilai y yg dimasukkan tidak valid");
        }
    }

    // print
    public void cetakPoint() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    // print dengan override method toString dari kelas object

    @Override
    public String toString() {
        return ("(" + this.x + "," + this.y + ")");
    }

    // other methods
    public void mirrorX() {
        this.x = -1 * this.x;
    }

    public void mirrorY() {
        this.y = -1 * this.y;
    }

    public static Point tambahPoint(Point A, Point B) {
        Point C = new Point();
        C.x = A.x + B.x;
        C.y = A.y + B.y;
        return C;
    }

    public Point tambahPoint2(Point B) {
        Point C = new Point();
        C.x = this.x + B.x;
        C.y = this.y + B.y;
        return C;
    }
}
