package Gun25._05_Soru;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Sorucozum {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Scanner read=new Scanner(System.in);

        ArrayList<bordro> list=new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            bordro brd=new bordro();
            System.out.print("Bordro no ="); brd.bordroNo= oku.nextInt();
            System.out.print("Tam adı ="); brd.tamAdi= read.nextLine();
            System.out.print("Maaşı ="); brd.maasi= oku.nextInt();
            
            list.add(brd);
        }
        
        butunCalisanlar(list);
        maasOrt(list);
        enAzveEnfazla(list);
    }
    public static void butunCalisanlar(ArrayList<bordro> list)
    {
        for (bordro brd : list){
            System.out.println("brd.bordroNo = " + brd.bordroNo);
            System.out.println("brd.tamAdi = " + brd.tamAdi);
            System.out.println("brd.maasi = " + brd.maasi);
        }
    }
    public static void maasOrt(ArrayList<bordro> list){
        int toplam=0;
        for (bordro brd:list){
            toplam+=brd.maasi;
        }
        System.out.println("maaş ortalaması = " + (toplam/ list.size()) );
    }
    public static void enAzveEnfazla(ArrayList<bordro> list){
        int enb;


    }
}
