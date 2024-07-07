
package javaapplication27;

public class nilaiSiswa {
    //atribut
    double tugas;
    double uts;
    double uas; 
    
    //constructor
    public nilaiSiswa(double tugas, double uts, double uas) {
    this.tugas = tugas;
    this.uts = uts;
    this.uas = uas;
    }
    
    //accessor
    public double getTugas() {
        return tugas;
    }
    
    public double getUts() {
        return uts;
    }
    
    public double getUas() {
        return uas;
    }
    
    //mutator
    public void setTugas(double tugas){
        this.tugas = tugas;
    }
    
    public void setUts(double uts){
        this.uts = uts;
    }
    public void setUas(double uas){
        this.uas = uas;
    }
        
}
