
package tugasguru;

import java.util.Scanner;
public class kalkulator {


    public static void main(String[] args) {
        String a,b;
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Kalkulator =====");
        System.out.println("masukan angka pertama");
        a = input.nextLine();
        
        System.out.println("masukan angka ke dua");
        b = input.nextLine();
        
        System.out.println("masukan jenis opersi derdasarakan angka\n1.pengurangan\n2.penjumlahan\n3.perkalian\n4.pembagian\n5.sisa bagi");
        int op = input.nextInt();
        
        System.out.println("hasilnya adalah");
        
        if (op == 1){
            System.out.println(pengurangan(a,b));
        }
        else if (op == 2){
            System.out.println(penjumlahan(a,b));
        }
        else if (op == 3){
            System.out.println(perkalian(a,b));
        }
        else if (op == 4){
            System.out.println(pembagian(a,b));
        }
        else if (op == 5){
            System.out.println(sisa(a,b));
        }
        else {
            System.out.println("maaf format yang anda masukan tidak valid");
        }
        
    }
    public static int pengurangan(String a, String b){
        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int c = d - e;
        return c;
    }
    public static int penjumlahan(String a, String b){
        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int c = d + e;
        return c;
    }
    public static int perkalian(String a, String b){
        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int c = d*e;
        return c;
    }
    public static double pembagian(String a, String b){
        double d = Double.parseDouble(a);
        double e = Double.parseDouble(b);
        double c = d / e;
        return c;
    }
    public static int sisa(String a, String b){
        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int c = d%e;
        return c;
    }
}
