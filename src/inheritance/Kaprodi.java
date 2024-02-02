
package inheritance;


public class Kaprodi extends Dosen {
    private String jurusan;

    public Kaprodi(String nidn, String nama, String jenisKelamin, String jurusan){
        super(nidn, nama, jenisKelamin);
        this.jurusan = jurusan;
    }
    
    public void viewKaprodi(){
        System.out.println("Jurusan :" + jurusan);
    }
 }
