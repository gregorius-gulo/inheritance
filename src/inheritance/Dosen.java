
package inheritance;

public class Dosen {
    private String nidn, nama, jenisKelamin;
    
    public Dosen (String nidn, String nama, String jenisKelamin){
        this.nidn = nidn;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }
    
    public void viewDosen(){
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        
    }
}
