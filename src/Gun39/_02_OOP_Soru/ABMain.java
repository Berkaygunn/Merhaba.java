package Gun39._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {

        A a=new A();
        System.out.println("A.mesaj = " + A.mesaj);
        
        B b=new B();  // constructor çalıştı
        System.out.println("A.mesaj = " + A.mesaj);
        
        A a2=new A();  // bunu değiştirici bir etkisi yok
        System.out.println("A.mesaj = " + A.mesaj);
    }
}
