public class Main {

    public static void main(String[] args) {

        StudentGrader grader = new StudentGrader();
        double nilai = grader.hitungNilaiAkhir(88, 85, 90);
        GradeReport report = new GradeReport();
        report.cetakLaporan("Mozes Popang", nilai);


        GradeDatabase database = new GradeDatabase();
        database.simpanDatabase("Mozes Popang", nilai);
    }
}