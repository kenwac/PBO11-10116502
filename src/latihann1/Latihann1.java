/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihann1;

/**
 *
 * @author ASUS
 */
public class Latihann1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        

    String nim = "7.51.15.036.";
    String nama = "Rizki Adam Kurniawan";
  
        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke "+i+" = "+nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " +j+ " = "+nim+j);
        }

        
        System.out.println(" ");
        System.out.println(" QUIS= 76.0");
        System.out.println(" UTS= 46.0");
        System.out.println(" UAS= 34.0");
        System.out.println(" ");
    double na;
          
    Mahasiswa oMhs = new Mahasiswa();
    oMhs.nama="Ken";
    oMhs.nim="10116502";
    oMhs.quiz=75;
    oMhs.uts=45;
    oMhs.uas=34;
    
  
    na=oMhs.getNilaiAkhir(oMhs.quiz, oMhs.uts, oMhs.uas);
        System.out.println("Nilai Akhir= "+na);
    oMhs.getIndexNilai(na);
    
    }
}
