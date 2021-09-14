class Main {
  public static void main(String[] args) {
    Point A = new Point(5,3);

    int nilaiX = A.getX();
    System.out.println(nilaiX);
    System.out.println(A.getY());

    A.setY(10);

    A.mirrorX();
    System.out.println(A.getX());

    System.out.println(A);

    A.set(6, 8);
    A.mirrorY();
    A.mirrorAll();
    // A = (8, 8);
    System.out.println(A);
  }
}