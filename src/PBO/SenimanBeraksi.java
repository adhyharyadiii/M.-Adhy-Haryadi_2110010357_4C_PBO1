package PBO;

//untuk melengkapi io sederhana
import java.util.Scanner;

//class untuk menjalankan kode program
public class SenimanBeraksi {
    public static void main(String[] args) {
        
        //error handling
        try{
            
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        SenimanDetail[] snm = new SenimanDetail[2];
        
        //perulangan
        for(int i=0; i < snm.length; i++){
            System.out.println("==========================================");
            System.out.println("                 Karya "+(i+1)+"          ");
            System.out.println("==========================================");
            System.out.print("Masukkan Nama : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Asal Daerah : ");
            String asal = scanner.nextLine();
            System.out.print("Masukkan Karya : ");
            String karya = scanner.nextLine();
            System.out.print("Masukkan Kode Karya : ");
            String kode_karya = scanner.nextLine();

            //objek
            snm[i] = new SenimanDetail(nama, asal, karya, kode_karya);
        }
        
        System.out.println("\n");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n");
        
        //perulangan
        for(SenimanDetail data: snm){
            System.out.println("==========================================");
            System.out.println("           Data Karya Seni Rupa           ");
            System.out.println("==========================================");
            System.out.println(data.displayInfo("Pameran Karya Seni Rupa"));
        }
            
      //error handling  
    } catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor : " + e.getMessage());
            
      //error handling      
    } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Kode Karya : " + e.getMessage());
            
      //error handling      
    } catch (Exception e){
            System.out.println("Kesalahan Umum : " + e.getMessage());
  }
 }
}