public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs[] = {
            new Mahasiswa("Shelsa", "254107060109", 2025, 90, 93),
            new Mahasiswa("Fia", "245678912345", 2024, 100, 85),
            new Mahasiswa("Netta", "254107060094", 2026, 95, 100)
        };

        NilaiMahasiswa nm = new NilaiMahasiswa();

        System.out.println("Nilai UTS Tertinggi : " + nm.maxUTS(mhs,0,mhs.length-1));
        System.out.println("Nilai UTS Terendah : " + nm.minUTS(mhs,0,mhs.length-1));
        System.out.println("Rata-rata Nilai UAS : " + nm.rataUAS(mhs));
    }
}
