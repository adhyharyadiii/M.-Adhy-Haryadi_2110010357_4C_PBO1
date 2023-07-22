package PBO;

//inheritance (subclass dari class Seniman)
public class SenimanDetail extends Seniman{
    
    //overriding      
    public SenimanDetail(String nama, String asal, String karya, String kode_karya) {
        super(nama, asal, karya, kode_karya);
    }

    //method
    public int getNoKarya() {
        return Integer.parseInt(getKode_karya().substring(0, 2));
    }

    //method
    public String getJenisKarya() {
        String kodeJk = getKode_karya().substring(2, 4);
        
        //seleksi if
        if(kodeJk.equals("02")){
            return "Karya 2 Dimensi";
        } else {
            return "Karya 3 Dimensi";
        }
    }
    
    //method
    public String getCabangSeni() {
        String kodeCs = getKode_karya().substring(4, 6);
        
        //seleksi switch
        switch(kodeCs){
            case "01":
                return "Seni Lukis";
            case "02": 
                return "Seni Grafis";
            case "03": 
                return "Seni Patung";
            case "04": 
                return "Seni Keramik";
            case "05": 
                return "Seni Kriya";
            default:
                return "Seni Lain";
        }
    }
    
    //method
    public int getTahunKaryaDibuat() {
        return Integer.parseInt(getKode_karya().substring(6, 10));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() + 
                "\nTahun Karya Dibuat : " + getTahunKaryaDibuat() + 
                "\nJenis Karya : " + getJenisKarya() + 
                "\nCabang Seni : " + getCabangSeni() + 
                "\nNo Karya : " + getNoKarya();
    }
}
