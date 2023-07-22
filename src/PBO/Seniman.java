package PBO;

//class
public class Seniman {
    
    //atribut dan encapsulation
    private String nama;
    private String asal;
    private String karya;
    private String kode_karya;

    //constructor
    public Seniman(String nama, String asal, String karya, String kode_karya) {
        this.nama = nama;
        this.asal = asal;
        this.karya = karya;
        this.kode_karya = kode_karya;
    }
    
    //accessor (getter)
    public String getNama() {    
        return nama ;
    }

    public String getAsal() {
        return asal;
    }

    public String getKarya() {
        return karya;
    }
    
    public String getKode_karya() {
        return kode_karya;
    }
    
    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setKarya(String karya) {
        this.karya = karya;
    }

    public void setKode_karya(String kode_karya) {
        this.kode_karya = kode_karya;
    }

    //method mengembalikan nilai tanpa parameter
    public String displayInfo() {
        return "Nama : " + getNama()+
               "\nAsal Daerah : " + getAsal()+
               "\nKarya : " + getKarya() +
               "\nKode Karya : " + getKode_karya() ;
    }
    
    //polymorphism (overloading) dengan parameter
    public String displayInfo(String tempat){
        return displayInfo() + 
               "\nTempat : "+tempat;
    }
}