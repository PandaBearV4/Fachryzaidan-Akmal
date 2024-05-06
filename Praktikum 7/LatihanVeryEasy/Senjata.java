/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanVeryEasy;

/**
 *
 * @author Zaidan
 */
public class Senjata {
    
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    private String getBunyi(){
        return bunyi;
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
    private boolean isMenusuk(){
        return menusuk;
    }
    
    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++){
            System.out.print(getBunyi()+" ");
            peluru--;
        }
        System.out.println("");
        System.out.println("Sisa peluru: "+ getPeluru());
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if(isMenusuk()){
            return "Jleb! ";
        }
        else {
            return "Gagal, belum pasang bayonet";
        }
    }
}