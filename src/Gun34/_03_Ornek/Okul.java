package Gun34._03_Ornek;

public class Okul {
    public static void main(String[] args) {

        LiseOgrencisi lo=new LiseOgrencisi("berkay gün", OgrTip.LISE,"MF");
        LiseOgrencisi lo2=new LiseOgrencisi("kardelen coskun", OgrTip.LISE,"TM");
        IlkOgrencisi io=new IlkOgrencisi("ahmet yılmaz", OgrTip.ILK,"tiyatro");


        System.out.println("lo = " + lo);
        System.out.println("lo2 = " + lo2);
        System.out.println("io = " + io);
    }
}
