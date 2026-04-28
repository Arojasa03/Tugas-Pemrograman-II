package latconsole;

public class Mahasiswa {

    String nim;
    String nama;
    double uts;
    double uas;

    double hitungRata() {
        return (uts + uas) / 2;
    }

    String hitungGrade() {
        double rata = hitungRata();

        if (rata >= 85) {
            return "A";
        } else if (rata >= 75) {
            return "B";
        } else if (rata >= 65) {
            return "C";
        } else if (rata >= 55) {
            return "D";
        } else {
            return "E";
        }
    }
}