package praktikum12_bagasmuhammadshaka;
import java.util.ArrayList;
        
public class Praktikum12_BagasMuhammadShaka {

    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<Integer>();
//        nilai.add(70);
//        nilai.add(75);
//        nilai.add(80);
        
        System.out.println(nilai);
        
        Mahasiswa mhs1 = new Mahasiswa("Naufal","2217051047",nilai);
//        mhs1.setNilai(nilai); 
         mhs1.nilaiRataRata();
  }
}
