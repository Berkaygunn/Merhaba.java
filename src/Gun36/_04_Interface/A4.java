package Gun36._04_Interface;

import Gun36._03_Interface.ICizdirir;

// 1 class 1 den fazla Interface implemente edebilir
public class A4 implements IGosterir, IYazdirir {
    @Override
    public void yazdir() {
        System.out.println("yazdırdı");

    }

    @Override
    public void goster() {
        System.out.println("gösterdi");
    }
}
