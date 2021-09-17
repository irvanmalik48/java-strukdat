public class Garis {
    // atribut
    private Point awal;
    private Point akhir;

    private boolean isValidGaris(Point newAwal, Point newAkhir) {
        return ((newAwal.getX() != newAkhir.getX()) || (newAwal.getY() != newAkhir.getY()));
    }

    // konstruktor default
    public Garis() {
        this.awal = new Point();
        this.akhir = new Point(0, 1);
    }

    // konstruktor
    public Garis(Point newAwal, Point newAkhir) {
        if (isValidGaris(newAwal, newAkhir)) {
            this.awal = newAwal;
            this.akhir = newAkhir;
        } else {
            System.out.println("Nilai yg dimasukkan tidak valid");
            this.awal = new Point();
            this.akhir = new Point(0, 1);
        }
    }

    // setter
    public void setAwal(Point awal) {
        if (isValidGaris(awal, this.akhir)) {
            this.awal = awal;
        } else {
            System.out.println(
                    "Point awal sama dengan point akhir. Operasi dibatalkan. Nilai dikembalikan ke nilai sebelumnya.");
        }
    }

    public void setAkhir(Point akhir) {
        if (isValidGaris(this.awal, akhir)) {
            this.akhir = akhir;
        } else {
            System.out.println(
                    "Point akhir sama dengan point awal. Operasi dibatalkan. Nilai dikembalikan ke nilai sebelumnya.");
        }
    }

    // getter
    public Point getAwal() {
        return this.awal;
    }

    public Point getAkhir() {
        return this.akhir;
    }

    // toString override
    @Override
    public String toString() {
        return "[" + this.awal + ", " + this.akhir + "]";
    }

    public void translateX(int x) {
        this.awal.setX(this.awal.getX() + x);
        this.akhir.setX(this.akhir.getX() + x);
    }

    public void translateY(int y) {
        this.awal.setY(this.awal.getY() + y);
        this.akhir.setY(this.akhir.getY() + y);
    }

    public void translate(int x, int y) {
        translateX(x);
        translateY(y);
    }

    public void rotate90() {
        this.awal.setX(-this.awal.getX());
        this.akhir.setX(-this.akhir.getX());
    }

    public void rotate180() {
        rotate90();
        rotate270();
    }

    public void rotate270() {
        this.awal.setY(-this.awal.getY());
        this.akhir.setY(-this.akhir.getY());
    }

    public void mirrorX() {
        int temp = this.awal.getX();
        this.awal.setX(this.akhir.getX());
        this.akhir.setX(temp);
    }

    public void mirrorY() {
        int temp = this.awal.getY();
        this.awal.setY(this.akhir.getY());
        this.akhir.setY(temp);
    }

    public void mirrorXY() {
        mirrorX();
        mirrorY();
    }

    public void dilate(int var) {
        this.akhir.setX(this.akhir.getX() * var);
        this.akhir.setY(this.akhir.getY() * var);
    }
}
