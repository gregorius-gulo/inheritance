
package inheritance;


public class Ketua extends Dosen {
    private int tahunMulai, jabatanKe;

    public Ketua(String nidn, String nama, String jenisKelamin, int tahunMulai, int jabatanKe) {
        super(nidn, nama, jenisKelamin);
        this.tahunMulai = tahunMulai;
        this.jabatanKe = jabatanKe;
    }
    
    public void viewKetua(){
        System.out.println("Tahun mulai jabatan:" + tahunMulai);
        System.out.println("Jabatan ketua ke-:" + jabatanKe);
    }
}
