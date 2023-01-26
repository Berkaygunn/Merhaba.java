package Gun25._03_Soru;


import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Scanner read=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i <3; i++) {

            Ogrenci ogr=new Ogrenci();
            System.out.print("Öğrenci adı =");   ogr.adi=read.nextLine();
            System.out.print("Öğrenci soyadı =");   ogr.soyadi=read.nextLine();
            System.out.print("Öğrenci sınıfı =");   ogr.sinifi= oku.nextInt();
            System.out.print("Öğrenci adresi =");   ogr.adres=read.nextLine();

            snf.add(ogr);
        }

        for (Ogrenci ogr: snf){
            System.out.println("Öğrenci adı =" + ogr.adi);
            System.out.println("Öğrenci soyadı =" + ogr.soyadi);
            System.out.println("Öğrenci sınıfı =" + ogr.sinifi);
            System.out.println("Öğrenci adresi =" + ogr.adres);
        }

    }
}
