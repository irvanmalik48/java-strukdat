//Buatlah ADTMhs yang memiliki atribut 
//nama : String
//nim : String
//angk : int

//Implementasikan primitifnya

class ADTMhs {
    private String nama, nim;
    private int angk;

    public ADTMhs() {
        this.nama = "Tidak ada nama";
        this.nim = "Tidak ada NIM";
        this.angk = 2005;
    }

    public ADTMhs(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.angk = 2005;
    }

    public ADTMhs(String nama, String nim, int angk) {
        this.nama = nama;
        this.nim = nim;
        this.angk = angk;
        validate();
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public int getAngkatan() {
        return this.angk;
    }

    public void setAll(String nama, String nim, int angk) {
        this.nama = nama;
        this.nim = nim;
        this.angk = angk;
        validate();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setAngkatan(int angk) {
        this.angk = angk;
        validate();
    }

    public void validate() {
        if (this.angk < 2005)
            this.angk = 2005;
        else if (this.angk > 2021)
            this.angk = 2021;
    }

    @Override
    public String toString() {
        return "[" + this.nama + ", " + this.nim + ", " + this.angk + "]";
    }
}