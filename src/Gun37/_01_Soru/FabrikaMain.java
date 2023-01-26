package Gun37._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {

        teslaCar tc=new teslaCar(310,"model 5");
        toyotaPrius prius=new toyotaPrius(1200,"sedan");
        Bus b=new Bus(7000,"IVECO");

        ArrayList<Vehicle>arabalar=new ArrayList<>();
        arabalar.add(tc);
        arabalar.add(prius);
        arabalar.add(b);

        for (Vehicle v: arabalar){
            System.out.println("-------------------------");
            System.out.println(v.getClass().getSimpleName()); // class ın adını verir
            System.out.println("-------------------------");

            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            if (v instanceof teslaCar) {
                System.out.println(((teslaCar)v).drive());
                System.out.println(((teslaCar)v).changeBattery());
            }
            else if (v instanceof toyotaPrius){
                System.out.println(((toyotaPrius)v).drive());
                System.out.println(((toyotaPrius)v).changeBattery());
                System.out.println(((toyotaPrius)v).changeOil());
            }
            else if (v instanceof Bus){
                System.out.println(((Bus)v).drive());
                System.out.println(((Bus)v).changeDeisel());
            }

        }
    }
}
