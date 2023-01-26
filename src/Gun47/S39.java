package Gun47;

public class S39 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "pink";
        shirts[1][0] = "orange";
        shirts[1][1] = "blue";

//        // a) medium:
//        for (int index =1; index < 2 ; index++) {
//            for (int idx = 0; idx < 2; idx++) {
//                System.out.println(shirts[index][idx]+":");
//            }
//        }
//
//        // b) small:
//        for (int index =0; index < 2 ; index++) {
//            for (int idx = 0; idx < index; idx++) {
//                System.out.println(shirts[index][idx]+":");
//            }
//        }

        // c) doğru cevap
        for (String[] c : shirts) {  // shirts içindeki satırları al ve c ismini ver ve döngüye gönder
            for (String s : c) {  // satırdaki elemanları al ve s adını vererek döngüye gönder
                System.out.println(s + ":");
            }
        }
//
//        // d) 2 sınır index değerini aştığı için RunTime hatası verir
//        for (int index=0; index<=2){
//            for (int idx=0; idx<=2){
//                System.out.println(shirts[index][idx] + ":");  // 02 de patlar
//                idx++;
//            }
//            index++;
//        }
    }
}
