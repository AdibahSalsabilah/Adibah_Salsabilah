
package adibah.salsabilah;

import java.util.Scanner;

public class AdibahSalsabilah {

    
    public static void main(String[] args) {
        System.out.println("Adibah Salsabilah");
        System.out.println("2209010064");
        System.out.println("Operator Penugasan111");
        System.out.println("===============");
        Scanner userInput = new Scanner (System.in);
        System.out.println("Gunakan angka untuk memilih opsi");
        System.out.println("v. Penambahan");
        System.out.println("w. Pengurangan");
        System.out.println("x. Pengkalian");
        System.out.println("y. Pembagian");
        System.out.println("z. Sisa bagi");
        
        System.out.print("input:");
        int input = userInput.nextInt();
        
    if (input == 1){
        System.out.println("Penambahan");
        System.out.println("Masukan angka 3");
        int nilaia = userInput.nextInt();
        System.out.println("Masukan angka 4");
        int nilaib = userInput.nextInt();
        
        int Hasil = nilaia+nilaib;
        System.out.println("Hasilnya adalah:" + Hasil);
    }   else{
        System.out.println("masukan nilai yang benar");
    }
    
    
    if (input == 2){
        System.out.println("Pengurangan");
        System.out.println("Masukan angka 3");
        int nilaia = userInput.nextInt();
        System.out.println("Masukan angka 4");
        int nilaib = userInput.nextInt();
        
        int Hasil = nilaia-nilaib;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
        
    if (input == 3){
        System.out.println("Perkalian");
        System.out.println("Masukan angka 3");
        int nilaia = userInput.nextInt();
        System.out.println("Masukan angka 4");
        int nilaib = userInput.nextInt();
        
        int Hasil = nilaia*nilaib;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
    
    if (input == 4){
        System.out.println("Pembagian");
        System.out.println("Masukan angka 3");
        int nilaia = userInput.nextInt();
        System.out.println("Masukan angka 4");
        int nilaib = userInput.nextInt();
        
        int Hasil = nilaia/nilaib;
        System.out.println("Hasilnya adalah:" + Hasil);
    
        
    }
    if (input == 5){
        System.out.println("Sisa bagi");
        System.out.println("Masukan angka 3");
        int nilaia = userInput.nextInt();
        System.out.println("Masukan angka 4");
        int nilaib = userInput.nextInt();
        
        int Hasil = nilaia%nilaib;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
    
    
    
    
    
        System.out.println(" Operator Pembanding ");
        System.out.println("===============");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 3: ");
        int angkaa = scanner.nextInt();

        System.out.print("Masukkan angka 4: ");
        int angkab = scanner.nextInt();

        
        boolean Lebih_besar = (angkaa > angkab);
        boolean Lebih_kecil = (angkaa < angkab);
        boolean Sama_dengan = (angkaa == angkab);
        boolean Tidak_sama_dengan = (angkaa != angkab);
        boolean Lebih_besar_sama_dengan = (angkaa >= angkab);
        boolean LEbih_kecil_sama_dengan = (angkaa <= angkab);
        

        
        System.out.println(angkaa + " > " + angkab + " adalah " + Lebih_besar);
        System.out.println(angkaa + " < " + angkab + " adalah " + Lebih_kecil);
        System.out.println(angkaa + " == " + angkab + " adalah " + Sama_dengan);
        System.out.println(angkaa + " != " + angkab + " adalah " + Tidak_sama_dengan);
        System.out.println(angkaa + " >= " + angkab + " adalah " + Lebih_besar_sama_dengan);
        System.out.println(angkaa + " <= " + angkab + " adalah " + LEbih_kecil_sama_dengan);

        
        
 
        System.out.println(" Operator Bitwise ");
        System.out.println("=============");
        
        
        Scanner baru = new Scanner(System.in);

        System.out.print("Masukkan angka 3 (bilangan bulat): ");
        int angka = scanner.nextInt();

        System.out.print("Masukkan angka 4 (bilangan bulat): ");
        int angkay = scanner.nextInt();

        
        int And = angkaa & angkab;
        int Or = angkaa | angkab;
        int Xor = angkaa ^ angkab;
        int Negatif_kembali = ~angkaa;
        int Negatif_kembali2 = ~angkab;
        int Left_shift = angkaa << angkab;
        int Right_shift = angkaa >> angkab;
        int Right_shift_unsigned = angkaa >>> angkab;


        
        System.out.println(angkaa + " & " + angkab + " = " + And);
        System.out.println(angkaa + " | " + angkab + " = " + Or);
        System.out.println(angkaa + " ^ " + angkab + " = " + Xor);
        System.out.println("~" + angkaa + " = " + Negatif_kembali);
        System.out.println("~" + angkab + " = " + Negatif_kembali2);
        System.out.println(angkaa + " << " + angkab + " = " + Left_shift);
        System.out.println(angkaa + " >> " + angkab + " = " + Right_shift);
        System.out.println(angkaa + " >>> " + angkab + " = " + Right_shift_unsigned);



        
        scanner.close();

    }
    
}
