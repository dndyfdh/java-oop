package sia.app.mahasiswa.data;

import sia.app.abstraction.Person;

public class Mahasiswa extends Person {
    public String nama;
    public String nim;
    public String phonenum;

    public Mahasiswa(String nama, String nim, String gender, String phonenum) {
        this.nama = nama;
        this.nim = nim;
        this.gender = gender;
        this.phonenum = phonenum;
        
    }
}
