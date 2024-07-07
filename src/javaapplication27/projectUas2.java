
package javaapplication27;

import java.util.Scanner;

class projectUas2 {
    private String npm;
    private String nama;

    public projectUas2(String npm, String nama){
        this.npm = npm;
        this.nama = nama;
    }
    
    public String getNpm() {
        return npm;
    }
    
    public String getNama() {
        return nama;
    }
    
    @Override
    public String toString(){
        return "NPM : " + npm + ", Nama : " + nama;
    }
}
