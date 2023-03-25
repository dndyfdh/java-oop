public class conditions {
    public static void main(String[] args) {
        int nilai = 80;
        int absensi = 75;

        if (nilai >= 80 && absensi >= 75) {
            System.out.println("Anda lulus..!");
        } else {
            System.out.println("Anda tidak lulus..!");
        }

        //Else if statement and nested condition
        if (absensi >= 75) {
            if (nilai >= 90) {
                System.out.println("Nilai A");
            } else if (nilai >= 80) {
                System.out.println("Nilai B");
            } else if (nilai >= 70) {
                System.out.println("Nilai C");
            } else if (nilai >= 60) {
                System.out.println("Nilai D");
            } else {
                System.out.println("Anda Tidak Lulus..!!");
            }
        } else {
            System.out.println("Anda Tidak Lulus..!!");
        }

        //Switch condition
        switch(nilai){
            case 90:
            System.out.println("Nilai A");
            case 80:
            System.out.println("Nilai B");
            default:
            System.out.println("Tidak Lulus");
        }
        

    }
}