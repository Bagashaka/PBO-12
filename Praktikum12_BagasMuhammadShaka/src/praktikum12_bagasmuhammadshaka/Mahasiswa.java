package praktikum12_bagasmuhammadshaka;
import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String npm;
    private ArrayList<Integer> nilai = new ArrayList<Integer>();

    public Mahasiswa(String nama,String npm,ArrayList<Integer> nilai){
    this.nama = nama;
    this.npm = npm;
    this.nilai = nilai;
    }
    
//    public double nilaiRataRata(){
//    int sum = 0;
//        for(int i = 0 ; i<this.nilai.size();i++){
//         sum+= this.nilai.get(i);
//        }
//        try{          
//           return sum/this.nilai.size(); 
//        }catch(Exception e){
//           return 0;
//        }     
//    }
    
    public void nilaiRataRata(){
    int sum = 0;
        for(int i = 0 ; i<this.nilai.size();i++){
         sum+= this.nilai.get(i);
        }
        try{          
           System.out.println("Nilai rata rata : "+sum/this.nilai.size()); 
        }catch(Exception e){
           System.out.println("Nilai rata rata : "+e.getMessage());
        }     
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNpm() {
        return npm;
    }
    public void setNpm(String npm) {
        this.npm = npm;
    }
    public ArrayList<Integer> getNilai() {
        return nilai;
    }
    public void setNilai(ArrayList<Integer> nilai) {
        if(nilai.size() == 0){
         throw new SecurityException("Array tidak boleh kosong");
        }else{
        this.nilai = nilai;
        }
    }   
}
