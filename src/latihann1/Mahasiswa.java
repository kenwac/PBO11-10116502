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
public class Mahasiswa {
    double quiz, uas, uts, na;
    String keterangan, nim, nama;
    char index;    

    double getNilaiAkhir(double quiz,double uts, double uas){ 
        na = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
        return na;
    }
    
    public void getIndexNilai(double na){
         if(na<=45){
            index='E';
            keterangan="sangat kurang";
            System.out.println("Index Nilai = "+index);
            System.out.println("Keterangan =  "+keterangan);
        } else if(na<=56){
            index='D';
            keterangan="kurang";
            System.out.println("Index Nilai = "+index); 
            System.out.println("Keterangan =  "+keterangan);
        } else if(na<=68){
            index='C';
            keterangan="cukup";
            System.out.println("Index Nilai = "+index); 
            System.out.println("Keterangan =  "+keterangan);
        } else if(na<=80){
            index='B';
            keterangan="baik";
            System.out.println("Index Nilai = "+index); 
            System.out.println("Keterangan =  "+keterangan);
             
        }else if(na<=100){
            index='A';
            keterangan="sangat baik";
            System.out.println("Index Nilai = "+index);
            System.out.println("Keterangan =  "+keterangan);
             
        }
    }
}


