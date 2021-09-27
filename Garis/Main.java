class Main {

	public static void main(String[] args) {
		Point a = new Point(2, 2);
		Point b = new Point(4, 8);
		Garis garis = new Garis();

		garis.setAwal(a);
		garis.setAkhir(b);

		System.out.println(garis);

		garis.translate(2, 2);
		System.out.println(garis);

		garis.translateX(4);
		System.out.println(garis);

		garis.translateY(4);
		System.out.println(garis);

		garis.mirrorX();
		System.out.println(garis);
		garis.mirrorX();

		System.out.println(garis);

		garis.mirrorY();
		System.out.println(garis);
		garis.mirrorY();

		System.out.println(garis);

		garis.mirrorXY();
		System.out.println(garis);
		garis.mirrorXY();

		System.out.println(garis);

		garis.dilate(3);
		System.out.println(garis);

		System.out.println(garis.getAwal());
		System.out.println(garis.getAkhir());
	}
}
