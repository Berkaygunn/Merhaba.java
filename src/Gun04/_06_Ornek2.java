package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazdırınız.
        // vücut kitle indexını de bularak yazdırınız. kg/ (boy*boy)

        double agirlik = 90;
        int boy = 186;
        double kitleIndex=agirlik / (boy*boy);

        System.out.println("kitleIndex= " + kitleIndex);
        System.out.println("boyunuz="+boy+",kilonuz="+agirlik);
    }
}
