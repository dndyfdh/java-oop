package sia.app.mahasiswa.application;

import sia.app.abstraction.Person;
import sia.app.mahasiswa.data.Mahasiswa;

public class MahasiswaApp extends Person{
    public static void main(String[] args) {
    Mahasiswa mahasiswa = new Mahasiswa("Budi","12345","Laki-laki","0821111");
    System.out.println(mahasiswa.nama);
    System.out.println(mahasiswa.nim);
    System.out.println(mahasiswa.gender);
    System.out.println(mahasiswa.phonenum);
    
    }
}
