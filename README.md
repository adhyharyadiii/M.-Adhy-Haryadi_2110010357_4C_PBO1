# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pembuatan data seniman menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, asal daerah, karya, dan kode karya, dan juga memberikan output berupa informasi detail dari kode karya tersebut seperti nomor karya, jenis karya, cabang seni, dan tahun karya dibuat.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Seniman`, `SenimanDetail`, dan `SenimanBeraksi` adalah contoh dari class.

```bash
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
```

2. **Object** adalah instance dari class. Pada kode ini, `snm[i] = new SenimanDetail(nama, asal, karya, kode karya);` adalah contoh pembuatan object.

```bash
snm[i] = new SenimanDetail(nama, asal, karya, kode karya);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `asal`, `karya`, `kode_karya` adalah contoh atribut.

```bash
//atribut
String nama;
String asal;
String karya;
String kode_karya;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Seniman` dan `SenimanDetail`.

```bash
//constructor
public Seniman(String nama, String asal, String karya, String kode_karya) {
    this.nama = nama;
    this.asal = asal;
    this.karya = karya;
    this.kode_karya = kode_karya;
}

//overriding      
public SenimanDetail(String nama, String asal, String karya, String kode_karya) {
    super(nama, asal, karya, kode_karya);
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setAsal`, `setKarya`, `setKode_karya` adalah contoh method mutator.

```bash
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
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getAsal`, `getKarya`, `getKode_karya`, `getNoKarya`, `getJenisKarya`, `getCabangSeni`, dan `getTahunKaryaDibuat` adalah contoh method accessor.

```bash
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

//method
public int getNoKarya() {
    return Integer.parseInt(getKode_karya().substring(0, 2));
}

public String getJenisKarya() {
    String kodeJk = getKode_karya().substring(2, 4);
}

public String getCabangSeni() {
        String kodeCs = getKode_karya().substring(4, 6);
}

public int getTahunKaryaDibuat() {
        return Integer.parseInt(getKode_karya().substring(6, 10));
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `asal`, `karya`, dan `kode_karya`  dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
//encapsulation
private String nama;
private String asal;
private String karya;
private String kode_karya;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SenimanDetail` mewarisi `Seniman` dengan sintaks `extends`.

```bash
//inheritance (subclass dari class Seniman)
public class SenimanDetail extends Seniman {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Seniman` merupakan overloading method `displayInfo` dan `displayInfo` di `SenimanDetail` merupakan override dari method `displayInfo` di `Seniman`.

```bash
//polymorphism (overloading) dengan parameter
    public String displayInfo(String tempat){
        return displayInfo() + 
               "\nTempat : "+tempat;
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
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getJenisKarya` dan seleksi `switch` dalam method `getCabangSeni`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i < snm.length; i++) {
    ...
}

for(SenimanDetail data: snm){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
//io sederhana
Scanner scanner = new Scanner(System.in);
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

System.out.println("==========================================");
System.out.println("           Data Karya Seni Rupa           ");
System.out.println("==========================================");
System.out.println(data.displayInfo("Pameran Karya Seni Rupa"));
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `SenimanDetail[] snm = new SenimanDetail[2];` adalah contoh penggunaan array.

```bash
//array
SenimanDetail[] snm = new SenimanDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
//error handling
try{
    //error handling  
} catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor : " + e.getMessage());
            
    //error handling      
} catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Kode Karya : " + e.getMessage());
            
    //error handling      
} catch (Exception e){
            System.out.println("Kesalahan Umum : " + e.getMessage());
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M. Adhy Haryadi
NPM: 2110010357
