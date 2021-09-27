class Main {

	public static void main(String[] args) {
		Waktu time1 = new Waktu();
		Waktu time2 = new Waktu(58, 99, 64);

		time1.setJam(20);
		time1.setMenit(70);
		time1.setDetik(80);

		System.out.println(time1);
		System.out.println(time2);

		System.out.printf("\nHari: %d", time1.getHari());
		System.out.printf("\nJam: %d", time1.getJam());
		System.out.printf("\nMenit: %d", time1.getMenit());
		System.out.printf("\nDetik: %d\n", time1.getDetik());

		System.out.printf("\nTotal detik time1: %d", time1.waktuToDetik());
		System.out.printf("\nTotal detik time2: %d\n", time2.waktuToDetik());

		System.out.printf(
			"\nTotal detik time1 tanpa hari: %d",
			time1.waktuToDetikNoHari()
		);
		System.out.printf(
			"\nTotal detik time2 tanpa hari: %d\n",
			time2.waktuToDetikNoHari()
		);
	}
}
