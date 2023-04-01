package sia.app.dosen.application;

import sia.app.dosen.data.Dosen;

public class dosenApp {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.nama = "Abdul" ;
        dosen.gender = "Perempuan";
        dosen.setUmur(21);

        System.out.println(dosen.nama);
        System.out.println(dosen.gender);
        System.out.println(dosen.getUmur());
    }
}
