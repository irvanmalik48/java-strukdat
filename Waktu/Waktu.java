public class Waktu {

	// atributnya :
	// int jam 0-23
	// int menit 0-59
	// int detik 0-59

	// primitif yg dibutuhkan
	// simple operation
	// WaktuToDetik, return nilai detik dari ADT waktu
	// tambahWaktu

	// Variables
	private int hari, jam, menit, detik;

	// Checking function
	private void check() {
		while (this.detik > 59) {
			this.menit++;
			this.detik -= 60;
		}

		while (this.menit > 59) {
			this.jam++;
			this.menit -= 60;
		}

		while (this.jam > 23) {
			this.hari++;
			this.jam -= 24;
		}
	}

	// Default Constructor
	public Waktu() {
		this.hari = this.jam = this.menit = this.detik = 0;
	}

	// Constructor with value
	public Waktu(int jam, int menit, int detik) {
		this.hari = 0;
		this.jam = jam;
		this.menit = menit;
		this.detik = detik;
		check();
	}

	// Getter
	public int getHari() {
		return this.hari;
	}

	public int getJam() {
		return this.jam;
	}

	public int getMenit() {
		return this.menit;
	}

	public int getDetik() {
		return this.detik;
	}

	// Setter
	public void setJam(int jam) {
		this.jam = jam;
		check();
	}

	public void setMenit(int menit) {
		this.menit = menit;
		check();
	}

	public void setDetik(int detik) {
		this.detik = detik;
		check();
	}

	// tambahWaktu
	public void tambahWaktu(int jam, int menit, int detik) {
		this.detik += detik;
		this.menit += menit;
		this.jam += jam;
		check();
	}

	// waktuToDetik
	public int waktuToDetik() {
		return (
			(this.hari * 24 * 60 * 60) +
			(this.jam * 60 * 60) +
			(this.menit * 60) +
			this.detik
		);
	}

	public int waktuToDetikNoHari() {
		return ((this.jam * 60 * 60) + (this.menit * 60) + this.detik);
	}

	// toString override
	@Override
	public String toString() {
		return String.format(
			"\nHari: %d\nJam: %d\nMenit: %d\nDetik: %d",
			hari,
			jam,
			menit,
			detik
		);
	}
}
