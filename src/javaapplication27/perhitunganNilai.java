
package javaapplication27;

class perhitunganNilai extends nilaiSiswa {
    private double absen;
    private projectUas2 projectUas2;
    
    public perhitunganNilai(projectUas2 projectUas2, double tugas, double uts, double uas, double absen) {
        super(tugas, uts, uas);
        this.absen = absen;
        this.projectUas2 = projectUas2;
    }
    
    public void info(){
    System.out.println(projectUas2.toString());
    double total = (getTugas() * 0.1) + (getUts() * 0.2) + (getUas() * 0.3) + (absen * 0.4);
    String grade = grade(total);
    
    System.out.println("Nilai Tugas     : " + getTugas());
    System.out.println("Nilai UTS       : " + getUts());
    System.out.println("Nilai Uas       : " + getUas());
    System.out.println("Nilai Absen     : " + absen);
    System.out.println("Nilai Total     : " + total);
    System.out.println("Nilai Grade     : " + grade);
    }
    
    //method grade
    private String grade(double total){
    if (total >= 85){
        return "A";
    }
    else if (total >= 70){
        return "B";
    }
    else if (total >= 55){
        return "C";
    }
    else if (total >= 40){
        return "D";
    }
    else {
    return "E";
    }
    }
}
