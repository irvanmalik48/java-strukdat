public class Main {
    public static void main(String[] args) {
        ADTMhs mhsA = new ADTMhs();
        ADTMhs mhsB = new ADTMhs("Ini Nama", "09021282022222");
        ADTMhs mhsC = new ADTMhs("Irvan Malik", "09021282025060", 2020);

        mhsA.setAll("Fernanda", "09021282033333", 2021);
        mhsB.setNama("Nur Hikari");
        mhsB.setNim("09021282044444");
        mhsB.setAngkatan(1);
        
        System.out.println(mhsC.getNama());
        System.out.println(mhsC.getNim());
        System.out.println(mhsC.getAngkatan());

        System.out.println(mhsA);
        System.out.println(mhsB);
        System.out.println(mhsC);
    }  
}